package kfooddelivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import kfooddelivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import kfooddelivery.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired DeliveryRepository deliveryRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookFinish'")
    public void wheneverCookFinish_UpdateOrderStatus(@Payload CookFinish cookFinish){

        CookFinish event = cookFinish;
        System.out.println("\n\n##### listener UpdateOrderStatus : " + cookFinish + "\n\n");


        

        // Sample Logic //
        Delivery.updateOrderStatus(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderPlaced'")
    public void wheneverOrderPlaced_CopyOrderInfo(@Payload OrderPlaced orderPlaced){

        OrderPlaced event = orderPlaced;
        System.out.println("\n\n##### listener CopyOrderInfo : " + orderPlaced + "\n\n");


        

        // Sample Logic //
        Delivery.copyOrderInfo(event);
        

        

    }

}


