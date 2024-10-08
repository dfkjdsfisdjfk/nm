package nm.infra;

import nm.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class IcmpDataHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<IcmpData>> {

    @Override
    public EntityModel<IcmpData> process(EntityModel<IcmpData> model) {
        return model;
    }
}
