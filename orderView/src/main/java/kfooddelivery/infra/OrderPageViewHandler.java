package kfooddelivery.infra;

import kfooddelivery.domain.*;
import kfooddelivery.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class OrderPageViewHandler {

    @Autowired
    private OrderPageRepository orderPageRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderPlaced_then_CREATE_1 (@Payload OrderPlaced orderPlaced) {
        try {

            if (!orderPlaced.validate()) return;

            // view 객체 생성
            OrderPage orderPage = new OrderPage();
            // view 객체에 이벤트의 Value 를 set 함
            orderPage.setOrderId(orderPlaced.getId());
            orderPage.setOrderStatus("ready");
            // view 레파지 토리에 save
            orderPageRepository.save(orderPage);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenPaid_then_UPDATE_1(@Payload Paid paid) {
        try {
            if (!paid.validate()) return;
                // view 객체 조회
            Optional<OrderPage> orderPageOptional = orderPageRepository.findById(paid.getId());

            if( orderPageOptional.isPresent()) {
                 OrderPage orderPage = orderPageOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderPage.setOrderStatus("Paid");    
                // view 레파지 토리에 save
                 orderPageRepository.save(orderPage);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderAccept_then_UPDATE_2(@Payload OrderAccept orderAccept) {
        try {
            if (!orderAccept.validate()) return;
                // view 객체 조회
            Optional<OrderPage> orderPageOptional = orderPageRepository.findById(orderAccept.getOrderId());

            if( orderPageOptional.isPresent()) {
                 OrderPage orderPage = orderPageOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderPage.setOrderStatus("orderAccept");    
                // view 레파지 토리에 save
                 orderPageRepository.save(orderPage);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderCancel_then_DELETE_1(@Payload OrderCancel orderCancel) {
        try {
            if (!orderCancel.validate()) return;
            // view 레파지 토리에 삭제 쿼리
            orderPageRepository.deleteById(orderCancel.getId());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

