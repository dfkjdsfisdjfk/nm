package nm.infra;

import nm.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ClientHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Client>> {

    @Override
    public EntityModel<Client> process(EntityModel<Client> model) {
        return model;
    }
}
