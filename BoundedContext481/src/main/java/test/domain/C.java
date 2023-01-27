package test.domain;

import java.util.*;
import lombok.*;
import test.domain.*;
import test.infra.AbstractEvent;

@Data
@ToString
public class C extends AbstractEvent {

    private Long id;

    public C(A aggregate) {
        super(aggregate);
    }

    public C() {
        super();
    }
}
