package nm.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import nm.domain.*;
import nm.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SwapToInspect extends AbstractEvent {

    private Long id;
    private String createDate;
    private String modifiDate;
    private String clientName;
    private String stateReq;
    private String stateDns;
    private String stateEtn;
    private String lastInspectDate;

    public SwapToInspect(Client aggregate) {
        super(aggregate);
    }

    public SwapToInspect() {
        super();
    }
}
//>>> DDD / Domain Event
