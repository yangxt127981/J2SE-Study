package com.yxt.object;

public class TestExtend {
  public static void main(String[] args){
	  Car car = new Car("BMW","car direction","car tier","car engine");
	  Bicycle bicycle = new Bicycle("forever","bicycle direction","bicycle tier","feet pedal");
	  System.out.println("car run:"+car.run());
	  System.out.println("bicycle run:"+bicycle.run());
	  System.out.println("car:"+car);
	  System.out.println("bicycle:"+bicycle);

  }
}
