package nm.domain;

import java.util.*;
import lombok.*;
import nm.domain.*;
import nm.infra.AbstractEvent;

@Data
@ToString
public class ClientInfoDeleted extends AbstractEvent {

    private Long id;
    private String clientName;
    private Date createDate;
    private Object details;
}
