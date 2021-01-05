package org.example.payments.domain;

import org.apache.kafka.clients.consumer.Consumer;
import org.example.payments.domain.Payments.MeetingAttendeeAddedIntegrationEvent;
import org.example.payments.domain.Payments.NewUserRegisteredIntegrationEvent;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service()
public class PaymentsConsumerService {

    public void receiveMeetingAttendeeAddedIntegrationEvent(MeetingAttendeeAddedIntegrationEvent meetingAttendeeAddedIntegrationEvent) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveMeetingAttendeeAddedIntegrationEventErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void receiveNewUserRegisteredIntegrationEvent(NewUserRegisteredIntegrationEvent newUserRegisteredIntegrationEvent) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveNewUserRegisteredIntegrationEventErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
