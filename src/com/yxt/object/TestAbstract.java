package com.yxt.object;

public class TestAbstract {
   public static void main(String[] args){
	   Animal dog = new Dog();
	   dog.move();
	   Animal bird = new Bird();
	   bird.move();
   }
}



class Dog extends Animal{
	private String eyeColor;
	
	public Dog(){
	}
	
	public void move(){
		System.out.println("dog run");
		
	}
	
}


class Bird extends Animal{
	private String furColor;
	
	public Bird(){
		
	}
	
	public void move(){
		System.out.println("bird fly");
		
	}
	
}