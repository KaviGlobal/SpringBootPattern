package com.example.KafkaDemo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDO {
	
	public UserDO(int userId, String userName) {
		this.userId=userId;
		this.userName=userName;
	}
	
	
	@JsonProperty
	private int userId;
	
	@JsonProperty
	private String userName;
	
	
	
}
