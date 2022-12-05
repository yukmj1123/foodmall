package kfooddelivery.domain;

import kfooddelivery.domain.*;
import kfooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Pick extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String orderStatus;
    private String storeId;
    private String storeTel;
    private String customerId;
    private String customerTel;
    private String customerAddr;
}


