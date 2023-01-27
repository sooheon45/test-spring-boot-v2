package test.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import test.domain.*;

@Component
public class BHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<B>> {

    @Override
    public EntityModel<B> process(EntityModel<B> model) {
        return model;
    }
}
