package com.redhat.quarkus.cafe.infrastructure;

import com.redhat.quarkus.cafe.domain.CreateOrderCommand;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.concurrent.CompletionStage;

@Path("/order")
@RegisterRestClient
public interface OrderService {

    @POST
    CompletionStage<Response> placeOrders(CreateOrderCommand createOrderCommand);
}
