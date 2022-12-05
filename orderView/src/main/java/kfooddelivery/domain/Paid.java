package kfooddelivery.domain;

import kfooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Paid extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Integer price;
}
