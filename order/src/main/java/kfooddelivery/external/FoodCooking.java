package kfooddelivery.external;

import java.util.Date;
import lombok.Data;

@Data
public class FoodCooking {

    private Long id;
    private Long orderId;
    private String orderStatus;
    private String menuId;
    private String storeId;
    private String customerId;
    private Integer qty;
    private String customerTel;
    private String customerAddr;
}
