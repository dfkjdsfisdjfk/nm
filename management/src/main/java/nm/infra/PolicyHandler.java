package nm.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import nm.config.kafka.KafkaProcessor;
import nm.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    ClientRepository clientRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ClientInfoCreated'"
    )
    public void wheneverClientInfoCreated_DataRegist(
        @Payload ClientInfoCreated clientInfoCreated
    ) {
        ClientInfoCreated event = clientInfoCreated;
        System.out.println(
            "\n\n##### listener DataRegist : " + clientInfoCreated + "\n\n"
        );

        // Sample Logic //
        Client.dataRegist(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ClientInfoModified'"
    )
    public void wheneverClientInfoModified_DataModify(
        @Payload ClientInfoModified clientInfoModified
    ) {
        ClientInfoModified event = clientInfoModified;
        System.out.println(
            "\n\n##### listener DataModify : " + clientInfoModified + "\n\n"
        );

        // Sample Logic //
        Client.dataModify(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='IcmpInspected'"
    )
    public void wheneverIcmpInspected_DataModify(
        @Payload IcmpInspected icmpInspected
    ) {
        IcmpInspected event = icmpInspected;
        System.out.println(
            "\n\n##### listener DataModify : " + icmpInspected + "\n\n"
        );

        // Sample Logic //
        Client.dataModify(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='HttpInspected'"
    )
    public void wheneverHttpInspected_DataModify(
        @Payload HttpInspected httpInspected
    ) {
        HttpInspected event = httpInspected;
        System.out.println(
            "\n\n##### listener DataModify : " + httpInspected + "\n\n"
        );

        // Sample Logic //
        Client.dataModify(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DnsInspected'"
    )
    public void wheneverDnsInspected_DataModify(
        @Payload DnsInspected dnsInspected
    ) {
        DnsInspected event = dnsInspected;
        System.out.println(
            "\n\n##### listener DataModify : " + dnsInspected + "\n\n"
        );

        // Sample Logic //
        Client.dataModify(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ClientInfoDeleted'"
    )
    public void wheneverClientInfoDeleted_DataDelete(
        @Payload ClientInfoDeleted clientInfoDeleted
    ) {
        ClientInfoDeleted event = clientInfoDeleted;
        System.out.println(
            "\n\n##### listener DataDelete : " + clientInfoDeleted + "\n\n"
        );

        // Sample Logic //
        Client.dataDelete(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
