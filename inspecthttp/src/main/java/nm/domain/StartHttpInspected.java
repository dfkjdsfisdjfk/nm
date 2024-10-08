package nm.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import nm.domain.*;
import nm.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StartHttpInspected extends AbstractEvent {

    private Long id;
    private String obj;
    private String objDetail;
    private String state;
    private Date endedDate;
    private String resultData;

    public StartHttpInspected(IcmpData aggregate) {
        super(aggregate);
    }

    public StartHttpInspected() {
        super();
    }
}
//>>> DDD / Domain Event
