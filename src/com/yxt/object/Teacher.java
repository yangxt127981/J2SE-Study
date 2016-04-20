package com.yxt.object;

public class Teacher implements Singer,Painter{
  public String name;
  public Teacher(String name){
	  this.name = name;
  }
  
  public void sing(){
	  System.out.println("teacher sing");
	  
  }
  
  public void music(){
	  System.out.println("teacher listen music");
	  
  }
  
  public void paint(){
	  System.out.println("teacher paint");
	  
  }
  
  public void beauty(){
	  System.out.println("teacher appreciated beauty");
	  
  }
}
