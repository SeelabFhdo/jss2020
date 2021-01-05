package org.example.meetings.kafka;

import java.util.HashMap;
import java.util.Map;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.example.meetings.domain.Meetings.MeetingAttendeeAddedIntegrationEvent;
import org.example.meetings.domain.Meetings.MeetingFeePaidIntegrationEvent;
import org.example.meetings.domain.Meetings.MeetingGroupProposalAcceptedIntegrationEvent;
import org.example.meetings.domain.Meetings.MeetingGroupProposedIntegrationEvent;
import org.example.meetings.domain.Meetings.NewUserRegisteredIntegrationEvent;
import org.example.meetings.domain.Meetings.SubscriptionExpirationDateChangedIntegrationEvent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.listener.SeekToCurrentErrorHandler;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;

@Configuration()
public class KafkaConfiguration {

    @Value(value = "${kafka.bootstrapAddress}")
    private String bootstrapAddress;

    @Bean()
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        return new KafkaAdmin(configs);
    }

    @Value(value = "${kafka.group.receiveNewUserRegisteredIntegrationEvent}")
    private String receiveNewUserRegisteredIntegrationEventConsumerGroupId;

    public ConsumerFactory<String, NewUserRegisteredIntegrationEvent> userRegistrationReceiveNewUserRegisteredIntegrationEventConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, receiveNewUserRegisteredIntegrationEventConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(NewUserRegisteredIntegrationEvent.class));
    }

    @Bean()
    public ConcurrentKafkaListenerContainerFactory<String, NewUserRegisteredIntegrationEvent> userRegistrationReceiveNewUserRegisteredIntegrationEventKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, NewUserRegisteredIntegrationEvent> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(userRegistrationReceiveNewUserRegisteredIntegrationEventConsumerFactory());
        factory.setErrorHandler(new SeekToCurrentErrorHandler());
        return factory;
    }

    @Value(value = "${kafka.group.receiveMeetingGroupProposalAcceptedIntegrationEvent}")
    private String receiveMeetingGroupProposalAcceptedIntegrationEventConsumerGroupId;

    public ConsumerFactory<String, MeetingGroupProposalAcceptedIntegrationEvent> meetingGroupCreationReceiveMeetingGroupProposalAcceptedIntegrationEventConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, receiveMeetingGroupProposalAcceptedIntegrationEventConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(MeetingGroupProposalAcceptedIntegrationEvent.class));
    }

    @Bean()
    public ConcurrentKafkaListenerContainerFactory<String, MeetingGroupProposalAcceptedIntegrationEvent> meetingGroupCreationReceiveMeetingGroupProposalAcceptedIntegrationEventKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, MeetingGroupProposalAcceptedIntegrationEvent> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(meetingGroupCreationReceiveMeetingGroupProposalAcceptedIntegrationEventConsumerFactory());
        factory.setErrorHandler(new SeekToCurrentErrorHandler());
        return factory;
    }

    @Value(value = "${kafka.group.receiveMeetingFeePaidIntegrationEvent}")
    private String receiveMeetingFeePaidIntegrationEventConsumerGroupId;

    public ConsumerFactory<String, MeetingFeePaidIntegrationEvent> paymentsReceiveMeetingFeePaidIntegrationEventConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, receiveMeetingFeePaidIntegrationEventConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(MeetingFeePaidIntegrationEvent.class));
    }

    @Bean()
    public ConcurrentKafkaListenerContainerFactory<String, MeetingFeePaidIntegrationEvent> paymentsReceiveMeetingFeePaidIntegrationEventKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, MeetingFeePaidIntegrationEvent> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(paymentsReceiveMeetingFeePaidIntegrationEventConsumerFactory());
        factory.setErrorHandler(new SeekToCurrentErrorHandler());
        return factory;
    }

    @Value(value = "${kafka.group.receiveSubscriptionExpirationDateChangedIntegrationEvent}")
    private String receiveSubscriptionExpirationDateChangedIntegrationEventConsumerGroupId;

    public ConsumerFactory<String, SubscriptionExpirationDateChangedIntegrationEvent> paymentsReceiveSubscriptionExpirationDateChangedIntegrationEventConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, receiveSubscriptionExpirationDateChangedIntegrationEventConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(SubscriptionExpirationDateChangedIntegrationEvent.class));
    }

    @Bean()
    public ConcurrentKafkaListenerContainerFactory<String, SubscriptionExpirationDateChangedIntegrationEvent> paymentsReceiveSubscriptionExpirationDateChangedIntegrationEventKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, SubscriptionExpirationDateChangedIntegrationEvent> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(paymentsReceiveSubscriptionExpirationDateChangedIntegrationEventConsumerFactory());
        factory.setErrorHandler(new SeekToCurrentErrorHandler());
        return factory;
    }

    public ProducerFactory<String, MeetingGroupProposedIntegrationEvent> meetingGroupCreationProducerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean()
    public KafkaTemplate<String, MeetingGroupProposedIntegrationEvent> meetingGroupCreationProducer() {
        return new KafkaTemplate<>(meetingGroupCreationProducerFactory());
    }

    public ProducerFactory<String, MeetingAttendeeAddedIntegrationEvent> meetingOrganizationProducerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean()
    public KafkaTemplate<String, MeetingAttendeeAddedIntegrationEvent> meetingOrganizationProducer() {
        return new KafkaTemplate<>(meetingOrganizationProducerFactory());
    }
}
