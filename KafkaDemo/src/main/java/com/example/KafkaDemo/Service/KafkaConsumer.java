package com.example.KafkaDemo.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "${spring.kafka.employeeAvrotopic.name}", groupId = "Employees")
	 public void consumeAvro(String message){
		System.out.println(message);

	}
	
	@KafkaListener(topics = "${spring.kafka.userjsontopic.name}", groupId = "user")
	 public void consumeJson(String message){
		System.out.println("jsonmessage..."+message);

	}
	
	
	
	/*@KafkaListener(topics = "${spring.kafka.userjsontopic.name}", groupId = "${spring.kafka.consumer.group-json-id}")
	 public void consumeJson(String message){
		System.out.println("json message...."+message);
		
	}
	
	@KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "helloworldgroup")
	 public void consumeMessage(String message){
		System.out.println("string message...."+message);
		
	}*/
	
	
}
