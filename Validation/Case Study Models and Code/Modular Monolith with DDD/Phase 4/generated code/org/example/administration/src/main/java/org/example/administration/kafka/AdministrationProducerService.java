package org.example.administration.kafka;

import org.example.administration.domain.Administration.MeetingGroupProposalAcceptedIntegrationEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

@Service()
public class AdministrationProducerService {

    private KafkaTemplate<String, MeetingGroupProposalAcceptedIntegrationEvent> meetingGroupCreationProducer;

    @Autowired()
    public void setMeetingGroupCreationProducer(KafkaTemplate<String, MeetingGroupProposalAcceptedIntegrationEvent> meetingGroupCreationProducer) {
        this.meetingGroupCreationProducer = meetingGroupCreationProducer;
    }

    @Value(value = "${kafka.topic.meetingGroupCreation}")
    private String meetingGroupCreationTopic;

    public ListenableFuture<SendResult<String, MeetingGroupProposalAcceptedIntegrationEvent>> sendMeetingGroupProposalAcceptedIntegrationEvent(MeetingGroupProposalAcceptedIntegrationEvent meetingGroupProposalAcceptedIntegrationEvent) {
        return meetingGroupCreationProducer.send(meetingGroupCreationTopic, meetingGroupProposalAcceptedIntegrationEvent);
    }
}
