package nm.domain;

import java.util.*;
import lombok.*;
import nm.domain.*;
import nm.infra.AbstractEvent;

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
}
