package kfooddelivery.domain;

import kfooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderAccept extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String orderStatus;
    private String menuId;
    private String storeId;
    private String customerId;
}
