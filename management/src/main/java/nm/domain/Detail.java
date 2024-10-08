package nm.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

//<<< DDD / Value Object
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Detail {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String type;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String obj;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String subobj;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String state;
}
//>>> DDD / Value Object
