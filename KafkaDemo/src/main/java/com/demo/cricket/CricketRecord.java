package com.demo.cricket;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CricketRecord {
	
	public CricketRecord(int batsmanage, String batsmanname) {
		this.batsmanage=batsmanage;
		this.batsmanname=batsmanname;
	}
	
	
	@JsonProperty
	private int batsmanage;
	
	@JsonProperty
	private String batsmanname;
	
	
	
}
