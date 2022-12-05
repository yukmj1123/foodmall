package kfooddelivery.domain;

import kfooddelivery.domain.Pick;
import kfooddelivery.domain.Delivered;
import kfooddelivery.RiderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Delivery_table")
@Data

public class Delivery  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private String orderStatus;
    
    
    
    
    
    private String storeId;
    
    
    
    
    
    private String storeTel;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String customerTel;
    
    
    
    
    
    private String customerAddr;

    @PostPersist
    public void onPostPersist(){


        Pick pick = new Pick(this);
        pick.publishAfterCommit();



        Delivered delivered = new Delivered(this);
        delivered.publishAfterCommit();

    }

    public static DeliveryRepository repository(){
        DeliveryRepository deliveryRepository = RiderApplication.applicationContext.getBean(DeliveryRepository.class);
        return deliveryRepository;
    }




    public static void updateOrderStatus(CookFinish cookFinish){

        /** Example 1:  new item 
        Delivery delivery = new Delivery();
        repository().save(delivery);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookFinish.get???()).ifPresent(delivery->{
            
            delivery // do something
            repository().save(delivery);


         });
        */

        
    }
    public static void copyOrderInfo(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        Delivery delivery = new Delivery();
        repository().save(delivery);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(delivery->{
            
            delivery // do something
            repository().save(delivery);


         });
        */

        
    }


}
