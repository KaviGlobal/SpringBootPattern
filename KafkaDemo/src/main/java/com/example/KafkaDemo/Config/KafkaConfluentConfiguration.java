package com.example.KafkaDemo.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class KafkaConfluentConfiguration {
	
	@Value("${spring.kafka.topic.name}")
    private String topicName;
	
	@Value("${spring.kafka.orderavrotopic.name}")
    private String orderAvroTopicName;
	
	@Value("${spring.kafka.userjsontopic.name}")
    private String orderJsonTopicName;
	
	@Value("${spring.kafka.paymentAvrotopic.name}")
    private String paymentAvroTopicName;
	
	
    @Bean
    public NewTopic javaguidesTopic(){
        return TopicBuilder.name(topicName)
                .build();
    }
    
    @Bean
    public NewTopic orderAvro(){
        return TopicBuilder.name(orderAvroTopicName)
                .build();
    }
    
    @Bean
    public NewTopic orderJson(){
        return TopicBuilder.name(orderJsonTopicName)
                .build();
    }
    
    @Bean
    public NewTopic paymentAvro(){
        return TopicBuilder.name(paymentAvroTopicName)
                .build();
    }
}	
