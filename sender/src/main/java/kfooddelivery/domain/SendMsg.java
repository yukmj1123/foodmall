package kfooddelivery.domain;

import kfooddelivery.domain.*;
import kfooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class SendMsg extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String orderStatus;
    private String menuId;
    private String customerId;
    private String customerTel;

    public SendMsg(Msg aggregate){
        super(aggregate);
    }
    public SendMsg(){
        super();
    }
}
