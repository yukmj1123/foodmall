package kfooddelivery.domain;

import kfooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderCancel extends AbstractEvent {

    private Long id;
    private String menuId;
    private Integer qty;
    private String storeId;
    private String customerId;
    private String customerTel;
    private String customerAddr;
}
