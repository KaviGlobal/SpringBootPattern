package com.example.KafkaDemo.Config;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;


//@Configuration
public class KafkaConfiguration {
	
	@Value("${confluent.property.file}")
	String propertyFile;
	
	@Value("${spring.kafka.consumer.group-id}")
	String groupId;
	
	@Bean
    public ProducerFactory<String, String> producerFactoryString() {
        Map<String, Object> configProps = new HashMap<>();
        try {
			configProps.putAll((Map)loadConfig(propertyFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return new DefaultKafkaProducerFactory<>(configProps);
    }
	 
    @Bean
    public KafkaTemplate<String, String> kafkaTemplateString() {
        return new KafkaTemplate<>(producerFactoryString());
    }
    
    @Bean
    public ConsumerFactory<String, String> consumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        try {
        	configProps.put(ConsumerConfig.GROUP_ID_CONFIG,groupId);
        	configProps.putAll((Map)loadConfig(propertyFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return new DefaultKafkaConsumerFactory<>(configProps);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        
        return factory;
    }
    
    private static Properties loadConfig(final String configFile) throws IOException {
    	
		final Properties cfg = new Properties();
		try (final InputStream stream =
				KafkaConfiguration.class.getClassLoader().getResourceAsStream(configFile)) {
			cfg.load(stream);
		}
		
		return cfg;
	}
	 
}	
