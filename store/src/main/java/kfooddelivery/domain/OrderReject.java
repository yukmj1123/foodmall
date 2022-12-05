package kfooddelivery.domain;

import kfooddelivery.domain.*;
import kfooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderReject extends AbstractEvent {

    private Long id;

    public OrderReject(FoodCooking aggregate){
        super(aggregate);
    }
    public OrderReject(){
        super();
    }
}
