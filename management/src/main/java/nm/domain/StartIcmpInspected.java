package nm.domain;

import java.util.*;
import lombok.*;
import nm.domain.*;
import nm.infra.AbstractEvent;

@Data
@ToString
public class StartIcmpInspected extends AbstractEvent {

    private Long id;
    private String obj;
    private String objDetail;
    private String state;
    private Date endedDate;
    private String resultData;
}
