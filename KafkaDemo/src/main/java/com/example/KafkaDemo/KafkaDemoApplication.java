package com.example.KafkaDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
//https://packages.confluent.io/maven/io/confluent/kafka-avro-serializer/5.3.0/
//https://www.youtube.com/watch?v=wy_BJsxTvo8
//https://www.maestralsolutions.com/spring-boot-implementation-for-apache-kafka-with-kafka-tool/
//https://github.com/RameshMF/springboot-kafka-course/blob/main/springboot-kafka-tutorial/src/main/java/net/javaguides/springboot/kafka/KafkaProducer.java
//https://docs.confluent.io/platform/current/schema-registry/fundamentals/serdes-develop/serdes-json.html

public class KafkaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaDemoApplication.class, args);
	}

}

