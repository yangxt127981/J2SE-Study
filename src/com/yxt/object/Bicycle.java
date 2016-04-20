package com.yxt.object;

public class Bicycle extends Vehicle{
	public String pedal;
	
	public Bicycle(){
		pedal="bicycle pedal";
	}
	
	public Bicycle(String name, String direction, String tier,String pedal){
		super(name,direction,tier);
		this.pedal= pedal;
	}
	
	public String toString(){
		return super.getName() + super.getTier() + super.getDirection() + this.pedal;
	}
	
	public String run(){
		return "Bicycle run";
	}
	
	public String getPedal(){
		return pedal;
	}
}
