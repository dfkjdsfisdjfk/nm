package nm.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import nm.domain.*;
import nm.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StartDnsInspected extends AbstractEvent {

    private Long id;
    private String obj;
    private String objDetail;
    private String state;
    private Date endedDate;
    private String resultData;

    public StartDnsInspected(IcmpData aggregate) {
        super(aggregate);
    }

    public StartDnsInspected() {
        super();
    }
}
//>>> DDD / Domain Event
