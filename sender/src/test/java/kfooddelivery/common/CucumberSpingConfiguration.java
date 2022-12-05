package kfooddelivery.common;


import kfooddelivery.SenderApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { SenderApplication.class })
public class CucumberSpingConfiguration {
    
}
