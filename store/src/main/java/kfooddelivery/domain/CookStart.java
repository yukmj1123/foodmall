package kfooddelivery.domain;

import kfooddelivery.domain.*;
import kfooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class CookStart extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String orderStatus;
    private String menuId;
    private String storeId;
    private String customerId;

    public CookStart(FoodCooking aggregate){
        super(aggregate);
    }
    public CookStart(){
        super();
    }
}
