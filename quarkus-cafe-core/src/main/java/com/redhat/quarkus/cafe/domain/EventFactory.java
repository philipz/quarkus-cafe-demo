package com.redhat.quarkus.cafe.domain;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class EventFactory {

    /**
     * Create an OrderCreatedEvent containing LineItemInEvents
     *
     * @param order
     * @return
     */
    public static OrderCreatedEvent createFromNewOrder(Order order) {

        OrderCreatedEvent orderCreatedEvent = new OrderCreatedEvent();
        if (order.beverageLineItems != null) {
            order.beverageLineItems.forEach(b -> {
                orderCreatedEvent.addEvent(new LineItemEvent(EventType.BEVERAGE_ORDER_IN, order.id.toString(), b.name, b.item));
            });
        }
        if (order.kitchenLineItems != null) {
            order.kitchenLineItems.forEach(k -> {
                orderCreatedEvent.addEvent(new LineItemEvent(EventType.KITCHEN_ORDER_IN, order.id.toString(), k.name, k.item));
            });
        }
        return orderCreatedEvent;
    }
}
