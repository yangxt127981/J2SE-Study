package com.yxt.object;

public class Vehicle{
	private String direction;
	private String name;
	private String tier;
	
	public Vehicle(){
		
	}
	
	public Vehicle(String name,String direction,String tier){
		this.name = name;
		this.direction = direction;
		this.tier = tier;

	}
	public String run(){
		return "Vehicle is running";
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getTier(){
		return this.tier;
	}
	
	public String getDirection(){
		return this.direction;
	}
}
