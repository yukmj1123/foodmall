package kfooddelivery.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="OrderPage_table")
@Data
public class OrderPage {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long orderId;
        private String orderStatus;


}
