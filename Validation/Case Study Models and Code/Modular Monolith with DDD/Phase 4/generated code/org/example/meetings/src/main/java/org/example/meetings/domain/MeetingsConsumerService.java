package org.example.meetings.domain;

import org.apache.kafka.clients.consumer.Consumer;
import org.example.meetings.domain.Meetings.MeetingFeePaidIntegrationEvent;
import org.example.meetings.domain.Meetings.MeetingGroupProposalAcceptedIntegrationEvent;
import org.example.meetings.domain.Meetings.NewUserRegisteredIntegrationEvent;
import org.example.meetings.domain.Meetings.SubscriptionExpirationDateChangedIntegrationEvent;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service()
public class MeetingsConsumerService {

    public void receiveNewUserRegisteredIntegrationEvent(NewUserRegisteredIntegrationEvent newUserRegisteredIntegrationEvent) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveNewUserRegisteredIntegrationEventErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void receiveMeetingGroupProposalAcceptedIntegrationEvent(MeetingGroupProposalAcceptedIntegrationEvent meetingGroupProposalAcceptedIntegrationEvent) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveMeetingGroupProposalAcceptedIntegrationEventErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void receiveMeetingFeePaidIntegrationEvent(MeetingFeePaidIntegrationEvent meetingFeePaidIntegrationEvent) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveMeetingFeePaidIntegrationEventErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void receiveSubscriptionExpirationDateChangedIntegrationEvent(SubscriptionExpirationDateChangedIntegrationEvent subscriptionExpirationDateChangedIntegrationEvent) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveSubscriptionExpirationDateChangedIntegrationEventErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
