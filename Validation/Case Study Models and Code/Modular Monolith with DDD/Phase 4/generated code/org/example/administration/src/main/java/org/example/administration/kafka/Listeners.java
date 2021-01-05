package org.example.administration.kafka;

import org.example.administration.domain.Administration.MeetingGroupProposedIntegrationEvent;
import org.example.administration.domain.Administration.NewUserRegisteredIntegrationEvent;
import org.example.administration.domain.AdministrationConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;
import org.springframework.stereotype.Component;

@Component()
public class Listeners {

    private AdministrationConsumerService administrationConsumerService;

    @Autowired()
    public void setAdministrationConsumerService(AdministrationConsumerService administrationConsumerService) {
        this.administrationConsumerService = administrationConsumerService;
    }

    @KafkaListener(topics = "${kafka.topic.meetingGroupCreation}", groupId = "${kafka.group.receiveMeetingGroupProposedIntegrationEvent}", containerFactory = "meetingGroupCreationReceiveMeetingGroupProposedIntegrationEventKafkaListenerContainerFactory", errorHandler = "receiveMeetingGroupProposedIntegrationEventErrorHandler")
    public void receiveMeetingGroupProposedIntegrationEventListener(MeetingGroupProposedIntegrationEvent meetingGroupProposedIntegrationEvent) {
        administrationConsumerService.receiveMeetingGroupProposedIntegrationEvent(meetingGroupProposedIntegrationEvent);
    }

    @Bean()
    public ConsumerAwareListenerErrorHandler receiveMeetingGroupProposedIntegrationEventErrorHandler() {
        return (message, exception, consumer) -> administrationConsumerService.receiveMeetingGroupProposedIntegrationEventErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.userRegistration}", groupId = "${kafka.group.receiveNewUserRegisteredIntegrationEvent}", containerFactory = "userRegistrationReceiveNewUserRegisteredIntegrationEventKafkaListenerContainerFactory", errorHandler = "receiveNewUserRegisteredIntegrationEventErrorHandler")
    public void receiveNewUserRegisteredIntegrationEventListener(NewUserRegisteredIntegrationEvent newUserRegisteredIntegrationEvent) {
        administrationConsumerService.receiveNewUserRegisteredIntegrationEvent(newUserRegisteredIntegrationEvent);
    }

    @Bean()
    public ConsumerAwareListenerErrorHandler receiveNewUserRegisteredIntegrationEventErrorHandler() {
        return (message, exception, consumer) -> administrationConsumerService.receiveNewUserRegisteredIntegrationEventErrorHandler(message, exception, consumer);
    }
}
