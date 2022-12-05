package kfooddelivery.domain;

import kfooddelivery.domain.*;
import kfooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class CookStart extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String orderStatus;
    private String menuId;
    private String storeId;
    private String customerId;
}


