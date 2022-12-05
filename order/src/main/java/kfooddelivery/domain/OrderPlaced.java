package kfooddelivery.domain;

import java.util.*;
import kfooddelivery.domain.*;
import kfooddelivery.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String menuId;
    private Integer qty;
    private String storeId;
    private String customerId;
    private String customerTel;
    private String customerAddr;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
