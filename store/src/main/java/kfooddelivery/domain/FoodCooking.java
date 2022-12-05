package kfooddelivery.domain;

import kfooddelivery.domain.CookStart;
import kfooddelivery.domain.CookFinish;
import kfooddelivery.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="FoodCooking_table")
@Data

public class FoodCooking  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Long orderId;

    private String orderStatus;

    private String menuId;

    private String storeId;

    private String customerId;

    private Integer qty;

    private String customerTel;

    private String customerAddr;

    @PostPersist
    public void onPostPersist(){


        CookStart cookStart = new CookStart(this);
        cookStart.publishAfterCommit();



        CookFinish cookFinish = new CookFinish(this);
        cookFinish.publishAfterCommit();

    }

    public static FoodCookingRepository repository(){
        FoodCookingRepository foodCookingRepository = StoreApplication.applicationContext.getBean(FoodCookingRepository.class);
        return foodCookingRepository;
    }



    public void accept(AcceptCommand acceptCommand){
        OrderAccept orderAccept = new OrderAccept(this);
        orderAccept.publishAfterCommit();

        OrderReject orderReject = new OrderReject(this);
        orderReject.publishAfterCommit();

    }

    public static void copyOrderInfo(OrderPlaced orderPlaced){

        /** Example 1:  new item */
        FoodCooking foodCooking = new FoodCooking();
        foodCooking.setMenuId(orderPlaced.getMenuId());
        foodCooking.setQty(orderPlaced.getQty());
        foodCooking.setStoreId(orderPlaced.getStoreId());
        foodCooking.setCustomerId(orderPlaced.getCustomerId());
        foodCooking.setCustomerTel(orderPlaced.getCustomerTel());
        foodCooking.setCustomerAddr(orderPlaced.getCustomerAddr());    
        foodCooking.setOrderStatus("Ready");    
        repository().save(foodCooking);

        

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(foodCooking->{
            
            foodCooking // do something
            repository().save(foodCooking);


         });
        */

        
    }
    public static void updateOrderStatus(Paid paid){

        /** Example 1:  new item 
        FoodCooking foodCooking = new FoodCooking();
        repository().save(foodCooking);

        */

        /** Example 2:  finding and process*/
        
        repository().findByOrderId(paid.getOrderId()).ifPresent(foodCooking->{
            
            foodCooking.setOrderStatus("orderPaid"); // do something
            repository().save(foodCooking);


         });
        

        
    }


}
