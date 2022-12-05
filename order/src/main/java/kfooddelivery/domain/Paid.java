package kfooddelivery.domain;

import kfooddelivery.domain.*;
import kfooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Paid extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Integer price;

    public Paid(Payment aggregate){
        super(aggregate);
    }
    public Paid(){
        super();
    }
}
