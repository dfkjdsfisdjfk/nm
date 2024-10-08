package nm.domain;

import nm.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "inputInfos",
    path = "inputInfos"
)
public interface InputInfoRepository
    extends PagingAndSortingRepository<InputInfo, Long> {}
