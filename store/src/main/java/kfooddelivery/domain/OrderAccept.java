package kfooddelivery.domain;

import kfooddelivery.domain.*;
import kfooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderAccept extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String orderStatus;
    private String menuId;
    private String storeId;
    private String customerId;

    public OrderAccept(FoodCooking aggregate){
        super(aggregate);
    }
    public OrderAccept(){
        super();
    }
}
