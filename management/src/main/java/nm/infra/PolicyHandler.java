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
        condition = "headers['type']=='StartIcmpInspected'"
    )
    public void wheneverStartIcmpInspected_DataModify(
        @Payload StartIcmpInspected startIcmpInspected
    ) {
        StartIcmpInspected event = startIcmpInspected;
        System.out.println(
            "\n\n##### listener DataModify : " + startIcmpInspected + "\n\n"
        );

        // Sample Logic //
        Client.dataModify(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='StartHttpInspected'"
    )
    public void wheneverStartHttpInspected_DataModify(
        @Payload StartHttpInspected startHttpInspected
    ) {
        StartHttpInspected event = startHttpInspected;
        System.out.println(
            "\n\n##### listener DataModify : " + startHttpInspected + "\n\n"
        );

        // Sample Logic //
        Client.dataModify(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='StartDnsInspected'"
    )
    public void wheneverStartDnsInspected_DataModify(
        @Payload StartDnsInspected startDnsInspected
    ) {
        StartDnsInspected event = startDnsInspected;
        System.out.println(
            "\n\n##### listener DataModify : " + startDnsInspected + "\n\n"
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
