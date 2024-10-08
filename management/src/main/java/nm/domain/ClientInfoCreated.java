package nm.domain;

import java.util.*;
import lombok.*;
import nm.domain.*;
import nm.infra.AbstractEvent;

@Data
@ToString
public class ClientInfoCreated extends AbstractEvent {

    private Long id;
    private String clientName;
    private Date createDate;
    private Date modifyDate;
    private String stateDns;
    private String stateSrl;
    private String stateTcp;
}
