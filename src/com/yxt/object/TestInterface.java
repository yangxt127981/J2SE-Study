package com.yxt.object;

public class TestInterface {
  public static void main(String[] args){
	  Singer s1 = new Student("hanson");
	  s1.sing();
	  s1.music();
	  Singer t1 = new Teacher("Lee");
	  t1.sing();
	  t1.music();
	  Painter t2 = (Teacher)t1;
	  t2.paint();
	  t2.beauty();
	  
	  Teacher t3 = new Teacher("steve");
	  t3.sing();
	  t3.music();
	  t3.paint();
	  t3.beauty();
	  
  }
}



 