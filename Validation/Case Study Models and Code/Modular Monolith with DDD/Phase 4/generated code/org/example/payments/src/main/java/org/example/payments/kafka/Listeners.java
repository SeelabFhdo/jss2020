package org.example.payments.kafka;

import org.example.payments.domain.Payments.MeetingAttendeeAddedIntegrationEvent;
import org.example.payments.domain.Payments.NewUserRegisteredIntegrationEvent;
import org.example.payments.domain.PaymentsConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;
import org.springframework.stereotype.Component;

@Component()
public class Listeners {

    private PaymentsConsumerService paymentsConsumerService;

    @Autowired()
    public void setPaymentsConsumerService(PaymentsConsumerService paymentsConsumerService) {
        this.paymentsConsumerService = paymentsConsumerService;
    }

    @KafkaListener(topics = "${kafka.topic.meetingOrganization}", groupId = "${kafka.group.receiveMeetingAttendeeAddedIntegrationEvent}", containerFactory = "meetingOrganizationReceiveMeetingAttendeeAddedIntegrationEventKafkaListenerContainerFactory", errorHandler = "receiveMeetingAttendeeAddedIntegrationEventErrorHandler")
    public void receiveMeetingAttendeeAddedIntegrationEventListener(MeetingAttendeeAddedIntegrationEvent meetingAttendeeAddedIntegrationEvent) {
        paymentsConsumerService.receiveMeetingAttendeeAddedIntegrationEvent(meetingAttendeeAddedIntegrationEvent);
    }

    @Bean()
    public ConsumerAwareListenerErrorHandler receiveMeetingAttendeeAddedIntegrationEventErrorHandler() {
        return (message, exception, consumer) -> paymentsConsumerService.receiveMeetingAttendeeAddedIntegrationEventErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.userRegistration}", groupId = "${kafka.group.receiveNewUserRegisteredIntegrationEvent}", containerFactory = "userRegistrationReceiveNewUserRegisteredIntegrationEventKafkaListenerContainerFactory", errorHandler = "receiveNewUserRegisteredIntegrationEventErrorHandler")
    public void receiveNewUserRegisteredIntegrationEventListener(NewUserRegisteredIntegrationEvent newUserRegisteredIntegrationEvent) {
        paymentsConsumerService.receiveNewUserRegisteredIntegrationEvent(newUserRegisteredIntegrationEvent);
    }

    @Bean()
    public ConsumerAwareListenerErrorHandler receiveNewUserRegisteredIntegrationEventErrorHandler() {
        return (message, exception, consumer) -> paymentsConsumerService.receiveNewUserRegisteredIntegrationEventErrorHandler(message, exception, consumer);
    }
}
