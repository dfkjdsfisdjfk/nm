package nm.domain;

import nm.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "clients", path = "clients")
public interface ClientRepository
    extends PagingAndSortingRepository<Client, Long> {}
