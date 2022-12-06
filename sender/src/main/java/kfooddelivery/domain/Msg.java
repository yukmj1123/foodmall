package kfooddelivery.domain;

import kfooddelivery.domain.SendMsg;
import kfooddelivery.SenderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Msg_table")
@Data

public class Msg  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private String orderStatus;
    
    
    
    
    
    private String menuId;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String customerTel;

    @PostPersist
    public void onPostPersist(){


        SendMsg sendMsg = new SendMsg(this);
        sendMsg.publishAfterCommit();

    }

    public static MsgRepository repository(){
        MsgRepository msgRepository = SenderApplication.applicationContext.getBean(MsgRepository.class);
        return msgRepository;
    }




    public static void notify(Pick pick){

        /** Example 1:  new item 
        Msg msg = new Msg();
        repository().save(msg);

        */

        /** Example 2:  finding and process
        
        repository().findById(pick.get???()).ifPresent(msg->{
            
            msg // do something
            repository().save(msg);


         });
        */

        
    }
    public static void notify(OrderAccept orderAccept){

        /** Example 1:  new item 
        Msg msg = new Msg();
        repository().save(msg);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderAccept.get???()).ifPresent(msg->{
            
            msg // do something
            repository().save(msg);


         });
        */

        
    }
    public static void notify(OrderReject orderReject){

        /** Example 1:  new item 
        Msg msg = new Msg();
        repository().save(msg);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderReject.get???()).ifPresent(msg->{
            
            msg // do something
            repository().save(msg);


         });
        */

        
    }
    public static void notify(CookStart cookStart){

        /** Example 1:  new item 
        Msg msg = new Msg();
        repository().save(msg);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookStart.get???()).ifPresent(msg->{
            
            msg // do something
            repository().save(msg);


         });
        */

        
    }
    public static void notify(CookFinish cookFinish){

        /** Example 1:  new item 
        Msg msg = new Msg();
        repository().save(msg);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookFinish.get???()).ifPresent(msg->{
            
            msg // do something
            repository().save(msg);


         });
        */

        
    }


}
