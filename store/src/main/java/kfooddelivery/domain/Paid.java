package kfooddelivery.domain;

import kfooddelivery.domain.*;
import kfooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Paid extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Integer price;
}


