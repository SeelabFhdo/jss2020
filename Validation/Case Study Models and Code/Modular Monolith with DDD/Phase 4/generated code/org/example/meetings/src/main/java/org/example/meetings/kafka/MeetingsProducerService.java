package org.example.meetings.kafka;

import org.example.meetings.domain.Meetings.MeetingAttendeeAddedIntegrationEvent;
import org.example.meetings.domain.Meetings.MeetingGroupProposedIntegrationEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

@Service()
public class MeetingsProducerService {

    private KafkaTemplate<String, MeetingGroupProposedIntegrationEvent> meetingGroupCreationProducer;

    @Autowired()
    public void setMeetingGroupCreationProducer(KafkaTemplate<String, MeetingGroupProposedIntegrationEvent> meetingGroupCreationProducer) {
        this.meetingGroupCreationProducer = meetingGroupCreationProducer;
    }

    @Value(value = "${kafka.topic.meetingGroupCreation}")
    private String meetingGroupCreationTopic;

    public ListenableFuture<SendResult<String, MeetingGroupProposedIntegrationEvent>> sendMeetingGroupProposedIntegrationEvent(MeetingGroupProposedIntegrationEvent meetingGroupProposedIntegrationEvent) {
        return meetingGroupCreationProducer.send(meetingGroupCreationTopic, meetingGroupProposedIntegrationEvent);
    }

    private KafkaTemplate<String, MeetingAttendeeAddedIntegrationEvent> meetingOrganizationProducer;

    @Autowired()
    public void setMeetingOrganizationProducer(KafkaTemplate<String, MeetingAttendeeAddedIntegrationEvent> meetingOrganizationProducer) {
        this.meetingOrganizationProducer = meetingOrganizationProducer;
    }

    @Value(value = "${kafka.topic.meetingOrganization}")
    private String meetingOrganizationTopic;

    public ListenableFuture<SendResult<String, MeetingAttendeeAddedIntegrationEvent>> sendMeetingAttendeeAddedIntegrationEvent(MeetingAttendeeAddedIntegrationEvent meetingAttendeeAddedIntegrationEvent) {
        return meetingOrganizationProducer.send(meetingOrganizationTopic, meetingAttendeeAddedIntegrationEvent);
    }
}
