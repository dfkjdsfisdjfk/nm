package nm.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import nm.domain.*;
import nm.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StartIcmpInspected extends AbstractEvent {

    private Long id;
    private String obj;
    private String objDetail;
    private String state;
    private Date endedDate;
    private String resultData;

    public StartIcmpInspected(IcmpData aggregate) {
        super(aggregate);
    }

    public StartIcmpInspected() {
        super();
    }
}
//>>> DDD / Domain Event
