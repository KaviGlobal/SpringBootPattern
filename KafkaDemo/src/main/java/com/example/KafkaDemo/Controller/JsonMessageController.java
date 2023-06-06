package com.example.KafkaDemo.Controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.cricket.CricketRecord;
import com.example.KafkaDemo.UserDO;

@RestController
@RequestMapping(path = "/api/v1/kafka")
public class JsonMessageController {

	
	@Value("${spring.kafka.userjsontopic.name}")
	String orderJsonTopicName;

	@Value("${spring.kafka.cricketjsontopic.name}")
	String cricketJsonTopicName;


	private final KafkaTemplate<String, UserDO> kafkaTemplate;

	public JsonMessageController(KafkaTemplate<String, UserDO> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	
	@RequestMapping(value = "/publishJsonMessage", method = RequestMethod.POST)
    public ResponseEntity<String> publishJsonMessage(@RequestBody UserDO userDO,
    		@RequestParam("topicName") String topicName){
    	try {
    		System.out.println("topicName..."+topicName);
    		ListenableFuture<SendResult<String, UserDO>> future =kafkaTemplate.send(topicName, userDO);
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
