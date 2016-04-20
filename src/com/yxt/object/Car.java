package com.yxt.object;

public class Car extends Vehicle{
	private String engine;
	
	public Car(){
		
	}
	
	public Car(String name,String direction,String tier,String engine){
		super(name,direction,tier);
		this.engine = engine;
	}
	
	public String toString(){
		return super.getName() + super.getTier() + super.getDirection() + this.engine;
	}
	
	public String getEngine(){
		return this.engine;
	}
	
	public String run(){
		return "car run";
	}
	
	
}
