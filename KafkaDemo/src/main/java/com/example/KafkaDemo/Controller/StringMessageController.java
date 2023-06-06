package com.example.KafkaDemo.Controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/kafka")
public class StringMessageController {

	
	@Value("${spring.kafka.topic.name}")
	String topicName;

	
	private final KafkaTemplate<String, String> kafkaTemplate;

	public StringMessageController(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	
	@RequestMapping(value = "/publishMessage", method = RequestMethod.POST)
    public ResponseEntity<String> publishMessage(String message){
    	
    	try {
    		ListenableFuture<SendResult<String, String>> future =kafkaTemplate.send(topicName, message);
			future.get();
			
		} catch (InterruptedException e) {
			return ResponseEntity.ok("Error "+e.getMessage());
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.ok("Error "+e.getMessage());
		}
    	return ResponseEntity.ok("Success");
    }

}
