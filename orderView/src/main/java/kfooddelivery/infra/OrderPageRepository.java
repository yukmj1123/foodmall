package kfooddelivery.infra;

import kfooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="orderPages", path="orderPages")
public interface OrderPageRepository extends PagingAndSortingRepository<OrderPage, Long> {

    

    
}
