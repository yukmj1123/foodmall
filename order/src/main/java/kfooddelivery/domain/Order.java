package kfooddelivery.domain;

import kfooddelivery.domain.OrderPlaced;
import kfooddelivery.domain.OrderCancel;
import kfooddelivery.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Order_table")
@Data

public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String menuId;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private String storeId;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String customerTel;
    
    
    
    
    
    private String customerAddr;
    
    
    
    
    
    private Integer price;

    @PostPersist
    public void onPostPersist(){


        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();



        OrderCancel orderCancel = new OrderCancel(this);
        orderCancel.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
