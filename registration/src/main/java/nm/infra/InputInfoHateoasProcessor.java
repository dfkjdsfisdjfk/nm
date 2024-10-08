package nm.infra;

import nm.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class InputInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<InputInfo>> {

    @Override
    public EntityModel<InputInfo> process(EntityModel<InputInfo> model) {
        return model;
    }
}
