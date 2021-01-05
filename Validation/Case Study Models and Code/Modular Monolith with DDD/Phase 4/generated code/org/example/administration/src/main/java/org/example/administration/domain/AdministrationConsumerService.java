package org.example.administration.domain;

import org.apache.kafka.clients.consumer.Consumer;
import org.example.administration.domain.Administration.MeetingGroupProposedIntegrationEvent;
import org.example.administration.domain.Administration.NewUserRegisteredIntegrationEvent;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service()
public class AdministrationConsumerService {

    public void receiveMeetingGroupProposedIntegrationEvent(MeetingGroupProposedIntegrationEvent meetingGroupProposedIntegrationEvent) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveMeetingGroupProposedIntegrationEventErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
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
