package kfooddelivery.domain;

import kfooddelivery.domain.*;
import kfooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString

public class OrderCancel extends AbstractEvent  {
    
    private Long id;
    private String menuId;
    private Integer qty;
    private String storeId;
    private String customerId;
    private String customerTel;
    private String customerAddr;
}



