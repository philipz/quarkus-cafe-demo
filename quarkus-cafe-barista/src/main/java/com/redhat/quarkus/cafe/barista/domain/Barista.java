package com.redhat.quarkus.cafe.barista.domain;

import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@ApplicationScoped
public class Barista {

    Logger logger = Logger.getLogger(Barista.class);

    public CompletionStage<BeverageOrder> orderIn(OrderInEvent beverageOrder) {

        logger.debug("orderIn: " + beverageOrder.toString());

        return CompletableFuture.supplyAsync(() -> {

            switch(beverageOrder.item){
                case COFFEE_BLACK:
                    return prepare(beverageOrder, 5);
                case COFFEE_WITH_ROOM:
                    return prepare(beverageOrder, 5);
                case LATTE:
                    return prepare(beverageOrder, 7);
                case CAPPUCCINO:
                    return prepare(beverageOrder, 9);
                default:
                    return prepare(beverageOrder, 11);
            }
        });
    }

    private BeverageOrder prepare(final OrderInEvent beverageOrder, int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        OrderUpEvent retVal = new OrderUpEvent(beverageOrder.orderId, beverageOrder.itemId, beverageOrder.name, beverageOrder.item);
        System.out.println("returning: " + retVal.toString());
        return retVal;
    }

}
