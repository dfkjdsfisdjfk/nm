package nm.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import nm.InspecticmpApplication;
import nm.domain.IcmpInspected;

@Entity
@Table(name = "IcmpData_table")
@Data
//<<< DDD / Aggregate Root
public class IcmpData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ipId;

    private String obj;

    private String objDetail;

    private String state;

    private Date endedDate;

    private String resultData;

    @PostPersist
    public void onPostPersist() {
        IcmpInspected icmpInspected = new IcmpInspected(this);
        icmpInspected.publishAfterCommit();
    }

    public static IcmpDataRepository repository() {
        IcmpDataRepository icmpDataRepository = InspecticmpApplication.applicationContext.getBean(
            IcmpDataRepository.class
        );
        return icmpDataRepository;
    }

    //<<< Clean Arch / Port Method
    public static void icmpInspect(SwapToInspect swapToInspect) {
        //implement business logic here:

        /** Example 1:  new item 
        IcmpData icmpData = new IcmpData();
        repository().save(icmpData);

        */

        /** Example 2:  finding and process
        
        repository().findById(swapToInspect.get???()).ifPresent(icmpData->{
            
            icmpData // do something
            repository().save(icmpData);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
