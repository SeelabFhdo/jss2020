package org.example.payments.kafka;

import java.util.HashMap;
import java.util.Map;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.example.payments.domain.Payments.MeetingAttendeeAddedIntegrationEvent;
import org.example.payments.domain.Payments.MeetingFeePaidIntegrationEvent;
import org.example.payments.domain.Payments.NewUserRegisteredIntegrationEvent;
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

    @Value(value = "${kafka.group.receiveMeetingAttendeeAddedIntegrationEvent}")
    private String receiveMeetingAttendeeAddedIntegrationEventConsumerGroupId;

    public ConsumerFactory<String, MeetingAttendeeAddedIntegrationEvent> meetingOrganizationReceiveMeetingAttendeeAddedIntegrationEventConsumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, receiveMeetingAttendeeAddedIntegrationEventConsumerGroupId);
        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(MeetingAttendeeAddedIntegrationEvent.class));
    }

    @Bean()
    public ConcurrentKafkaListenerContainerFactory<String, MeetingAttendeeAddedIntegrationEvent> meetingOrganizationReceiveMeetingAttendeeAddedIntegrationEventKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, MeetingAttendeeAddedIntegrationEvent> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(meetingOrganizationReceiveMeetingAttendeeAddedIntegrationEventConsumerFactory());
        factory.setErrorHandler(new SeekToCurrentErrorHandler());
        return factory;
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

    public ProducerFactory<String, MeetingFeePaidIntegrationEvent> meetingOrganizationProducerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean()
    public KafkaTemplate<String, MeetingFeePaidIntegrationEvent> meetingOrganizationProducer() {
        return new KafkaTemplate<>(meetingOrganizationProducerFactory());
    }
}
