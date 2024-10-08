package nm.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import nm.domain.*;
import nm.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ClientInfoDeleted extends AbstractEvent {

    private Long id;
    private String clientName;
    private Date createDate;
    private Date modifyDate;
    private String stateDns;
    private String stateSrl;
    private String stateTcp;

    public ClientInfoDeleted(InputInfo aggregate) {
        super(aggregate);
    }

    public ClientInfoDeleted() {
        super();
    }
}
//>>> DDD / Domain Event
