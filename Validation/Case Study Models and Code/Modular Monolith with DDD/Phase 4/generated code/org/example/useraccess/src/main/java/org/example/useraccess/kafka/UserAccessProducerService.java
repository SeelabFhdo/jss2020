package org.example.useraccess.kafka;

import org.example.useraccess.domain.UserAccess.NewUserRegisteredIntegrationEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

@Service()
public class UserAccessProducerService {

    private KafkaTemplate<String, NewUserRegisteredIntegrationEvent> userRegistrationProducer;

    @Autowired()
    public void setUserRegistrationProducer(KafkaTemplate<String, NewUserRegisteredIntegrationEvent> userRegistrationProducer) {
        this.userRegistrationProducer = userRegistrationProducer;
    }

    @Value(value = "${kafka.topic.userRegistration}")
    private String userRegistrationTopic;

    public ListenableFuture<SendResult<String, NewUserRegisteredIntegrationEvent>> sendNewUserRegisteredIntegrationEvent(NewUserRegisteredIntegrationEvent newUserRegisteredIntegrationEvent) {
        return userRegistrationProducer.send(userRegistrationTopic, newUserRegisteredIntegrationEvent);
    }
}
