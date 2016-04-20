package com.yxt.object;

public class Driver {
  private String name;
  private Vehicle v;
  
  public Driver(String name,Vehicle v){
	  this.name = name;
	  this.v = v;
  }
  
  public void driveVehicle(){
	  System.out.println(v.run());
  }
}
