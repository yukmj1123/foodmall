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
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Pick'")
    public void wheneverPick_Notify(@Payload Pick pick){

        Pick event = pick;
        System.out.println("\n\n##### listener Notify : " + pick + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderAccept'")
    public void wheneverOrderAccept_Notify(@Payload OrderAccept orderAccept){

        OrderAccept event = orderAccept;
        System.out.println("\n\n##### listener Notify : " + orderAccept + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderReject'")
    public void wheneverOrderReject_Notify(@Payload OrderReject orderReject){

        OrderReject event = orderReject;
        System.out.println("\n\n##### listener Notify : " + orderReject + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookStart'")
    public void wheneverCookStart_Notify(@Payload CookStart cookStart){

        CookStart event = cookStart;
        System.out.println("\n\n##### listener Notify : " + cookStart + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookFinish'")
    public void wheneverCookFinish_Notify(@Payload CookFinish cookFinish){

        CookFinish event = cookFinish;
        System.out.println("\n\n##### listener Notify : " + cookFinish + "\n\n");


        

        // Sample Logic //

        

    }

}


