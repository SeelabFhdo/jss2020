package org.example.payments.kafka;

import org.example.payments.domain.Payments.MeetingFeePaidIntegrationEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

@Service()
public class PaymentsProducerService {

    private KafkaTemplate<String, MeetingFeePaidIntegrationEvent> meetingOrganizationProducer;

    @Autowired()
    public void setMeetingOrganizationProducer(KafkaTemplate<String, MeetingFeePaidIntegrationEvent> meetingOrganizationProducer) {
        this.meetingOrganizationProducer = meetingOrganizationProducer;
    }

    @Value(value = "${kafka.topic.meetingOrganization}")
    private String meetingOrganizationTopic;

    public ListenableFuture<SendResult<String, MeetingFeePaidIntegrationEvent>> sendMeetingFeePaidIntegrationEvent(MeetingFeePaidIntegrationEvent meetingFeePaidIntegrationEvent) {
        return meetingOrganizationProducer.send(meetingOrganizationTopic, meetingFeePaidIntegrationEvent);
    }

    public ListenableFuture<SendResult<String, MeetingFeePaidIntegrationEvent>> sendSubscriptionExpirationDateChangedIntegrationEvent(MeetingFeePaidIntegrationEvent meetingFeePaidIntegrationEvent) {
        return meetingOrganizationProducer.send(meetingOrganizationTopic, meetingFeePaidIntegrationEvent);
    }
}
