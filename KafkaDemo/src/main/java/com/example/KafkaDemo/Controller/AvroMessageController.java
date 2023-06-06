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
import org.springframework.web.bind.annotation.RestController;

import com.demo.employee.employeeRecord;

@RestController
@RequestMapping(path = "/api/v1/kafka")
public class AvroMessageController {

	

	@Value("${spring.kafka.paymentAvrotopic.name}")
	String paymentAvroTopicName;
	
	@Value("${spring.kafka.employeeAvrotopic.name}")
	String employeeAvroTopicName;
	
	

	private final KafkaTemplate<String, employeeRecord> kafkaTemplate;

	public AvroMessageController(KafkaTemplate<String, employeeRecord> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	
	
	
	@RequestMapping(value = "/publishAvroMessage", method = RequestMethod.POST)
    public ResponseEntity<String> publish(@RequestBody employeeRecord employee){
    	//Order order=new Order(1,7666666, "Address 1");
    	try {
    		ListenableFuture<SendResult<String, employeeRecord>> future =kafkaTemplate.send(employeeAvroTopicName, employee);
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
