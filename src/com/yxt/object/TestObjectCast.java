package com.yxt.object;

public class TestObjectCast {
	 public static void main(String[] args){
		Vehicle v = new Vehicle();
		Car car = new Car("bmw","bmw direction","bmw tier","bmw engine");
		Bicycle bicycle = new Bicycle("forever","bike direction","bicycle tier","feet pedal");
	    System.out.println(car instanceof Vehicle);
	    System.out.println(bicycle instanceof Vehicle);
	    System.out.println(v instanceof Vehicle);
        v = new Car("benz","benz direction","benz tier","benz engine");;
	    System.out.println(v.getName());
	    System.out.println(v instanceof Vehicle);
	    System.out.println(v instanceof Car);
        Car car1 = (Car)v;
	    System.out.println(car1.getEngine());

//	      System.out.println(cat1.equals(person));
//	      System.out.println(cat1.equals(cat2));

	  }
}





