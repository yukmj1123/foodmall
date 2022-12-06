package kfooddelivery.infra;
import kfooddelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class MsgHateoasProcessor implements RepresentationModelProcessor<EntityModel<Msg>>  {

    @Override
    public EntityModel<Msg> process(EntityModel<Msg> model) {

        
        return model;
    }
    
}
