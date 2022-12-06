package kfooddelivery.domain;

import kfooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="msgs", path="msgs")
public interface MsgRepository extends PagingAndSortingRepository<Msg, Long>{

}
