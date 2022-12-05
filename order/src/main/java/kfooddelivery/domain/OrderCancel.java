package kfooddelivery.domain;

import kfooddelivery.domain.*;
import kfooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCancel extends AbstractEvent {

    private Long id;
    private String menuId;
    private Integer qty;
    private String storeId;
    private String customerId;
    private String customerTel;
    private String customerAddr;

    public OrderCancel(Order aggregate){
        super(aggregate);
    }
    public OrderCancel(){
        super();
    }
}
