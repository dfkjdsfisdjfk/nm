package nm.domain;

import nm.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "icmpData", path = "icmpData")
public interface IcmpDataRepository
    extends PagingAndSortingRepository<IcmpData, Long> {}
