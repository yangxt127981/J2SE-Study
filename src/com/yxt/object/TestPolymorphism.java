package com.yxt.object;

public class TestPolymorphism {
  public static void main(String[] args){
//	  Bicycle bicycle = new Bicycle();
//	  Driver driver1 = new Driver("hanson",bicycle);
//
//	  Car car = new Car();
//	  Driver driver2 = new Driver("hanson",car);
//      
//	  Airplane air = new Airplane();
//	  Driver driver3 = new Driver("hanson",air);
//	  
//	  driver1.driveVehicle();
//	  driver2.driveVehicle();
//	  driver3.driveVehicle();
	  
	  Vehicle v1 = new Bicycle();
      System.out.println(v1.run());
	  Vehicle v2 = new Car();
	  System.out.println(v2.run());
	  Vehicle v3 = new Airplane();
	  System.out.println(v3.run());
  }
  
}
