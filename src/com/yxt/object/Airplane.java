package com.yxt.object;

public class Airplane extends Vehicle{
   private String screw;
	public Airplane(){
		
	}
	
	public Airplane(String name,String direction,String tier,String screw){
		super(name,direction,tier);
		this.screw = screw;
	}
	
	public String toString(){
		return super.getName() + super.getTier() + super.getDirection() + this.screw;
	}
	
	public String getScrew(){
		return this.screw;
	}
	
	public String run(){
		return "airplane run";
	}
}
