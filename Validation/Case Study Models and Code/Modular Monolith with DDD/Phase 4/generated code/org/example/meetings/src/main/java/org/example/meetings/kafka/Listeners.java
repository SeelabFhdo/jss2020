package org.example.meetings.kafka;

import org.example.meetings.domain.Meetings.MeetingFeePaidIntegrationEvent;
import org.example.meetings.domain.Meetings.MeetingGroupProposalAcceptedIntegrationEvent;
import org.example.meetings.domain.Meetings.NewUserRegisteredIntegrationEvent;
import org.example.meetings.domain.Meetings.SubscriptionExpirationDateChangedIntegrationEvent;
import org.example.meetings.domain.MeetingsConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;
import org.springframework.stereotype.Component;

@Component()
public class Listeners {

    private MeetingsConsumerService meetingsConsumerService;

    @Autowired()
    public void setMeetingsConsumerService(MeetingsConsumerService meetingsConsumerService) {
        this.meetingsConsumerService = meetingsConsumerService;
    }

    @KafkaListener(topics = "${kafka.topic.userRegistration}", groupId = "${kafka.group.receiveNewUserRegisteredIntegrationEvent}", containerFactory = "userRegistrationReceiveNewUserRegisteredIntegrationEventKafkaListenerContainerFactory", errorHandler = "receiveNewUserRegisteredIntegrationEventErrorHandler")
    public void receiveNewUserRegisteredIntegrationEventListener(NewUserRegisteredIntegrationEvent newUserRegisteredIntegrationEvent) {
        meetingsConsumerService.receiveNewUserRegisteredIntegrationEvent(newUserRegisteredIntegrationEvent);
    }

    @Bean()
    public ConsumerAwareListenerErrorHandler receiveNewUserRegisteredIntegrationEventErrorHandler() {
        return (message, exception, consumer) -> meetingsConsumerService.receiveNewUserRegisteredIntegrationEventErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.meetingGroupCreation}", groupId = "${kafka.group.receiveMeetingGroupProposalAcceptedIntegrationEvent}", containerFactory = "meetingGroupCreationReceiveMeetingGroupProposalAcceptedIntegrationEventKafkaListenerContainerFactory", errorHandler = "receiveMeetingGroupProposalAcceptedIntegrationEventErrorHandler")
    public void receiveMeetingGroupProposalAcceptedIntegrationEventListener(MeetingGroupProposalAcceptedIntegrationEvent meetingGroupProposalAcceptedIntegrationEvent) {
        meetingsConsumerService.receiveMeetingGroupProposalAcceptedIntegrationEvent(meetingGroupProposalAcceptedIntegrationEvent);
    }

    @Bean()
    public ConsumerAwareListenerErrorHandler receiveMeetingGroupProposalAcceptedIntegrationEventErrorHandler() {
        return (message, exception, consumer) -> meetingsConsumerService.receiveMeetingGroupProposalAcceptedIntegrationEventErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.payments}", groupId = "${kafka.group.receiveMeetingFeePaidIntegrationEvent}", containerFactory = "paymentsReceiveMeetingFeePaidIntegrationEventKafkaListenerContainerFactory", errorHandler = "receiveMeetingFeePaidIntegrationEventErrorHandler")
    public void receiveMeetingFeePaidIntegrationEventListener(MeetingFeePaidIntegrationEvent meetingFeePaidIntegrationEvent) {
        meetingsConsumerService.receiveMeetingFeePaidIntegrationEvent(meetingFeePaidIntegrationEvent);
    }

    @Bean()
    public ConsumerAwareListenerErrorHandler receiveMeetingFeePaidIntegrationEventErrorHandler() {
        return (message, exception, consumer) -> meetingsConsumerService.receiveMeetingFeePaidIntegrationEventErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.payments}", groupId = "${kafka.group.receiveSubscriptionExpirationDateChangedIntegrationEvent}", containerFactory = "paymentsReceiveSubscriptionExpirationDateChangedIntegrationEventKafkaListenerContainerFactory", errorHandler = "receiveSubscriptionExpirationDateChangedIntegrationEventErrorHandler")
    public void receiveSubscriptionExpirationDateChangedIntegrationEventListener(SubscriptionExpirationDateChangedIntegrationEvent subscriptionExpirationDateChangedIntegrationEvent) {
        meetingsConsumerService.receiveSubscriptionExpirationDateChangedIntegrationEvent(subscriptionExpirationDateChangedIntegrationEvent);
    }

    @Bean()
    public ConsumerAwareListenerErrorHandler receiveSubscriptionExpirationDateChangedIntegrationEventErrorHandler() {
        return (message, exception, consumer) -> meetingsConsumerService.receiveSubscriptionExpirationDateChangedIntegrationEventErrorHandler(message, exception, consumer);
    }
}
