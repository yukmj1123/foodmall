package kfooddelivery.domain;

import kfooddelivery.domain.*;
import kfooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class CookFinish extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String orderStatus;
    private String menuId;
    private String storeId;
    private String customerId;

    public CookFinish(FoodCooking aggregate){
        super(aggregate);
    }
    public CookFinish(){
        super();
    }
}
