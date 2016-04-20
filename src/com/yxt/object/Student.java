package com.yxt.object;

public class Student implements Singer{
	
	public String name;
	public Student(String name){
		this.name = name;
	}
	
	public void sing(){
		System.out.println("student sign.");
	}
	
	public void music(){
		System.out.println("student listen music");
	}

}
