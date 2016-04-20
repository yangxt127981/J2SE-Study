package com.yxt.collection;

public class Person implements Comparable{
  private String firstName;
  private String lastName;
  
  public Person(String firstName, String lastName){
	  this.firstName = firstName;
	  this.lastName = lastName;
  }
  
  public String getFirstName(){
	  return this.firstName;
  }
  
  public String getLastName(){
	  return this.lastName;
  }
  
  public String toString(){
	  return this.lastName+" "+this.firstName;
  }
  

  //override equals method to compare object'attribute instead of reference
  public boolean equals(Object obj){
	  if(obj instanceof Person){
		  Person p = (Person)obj;
          return (firstName.equals(p.firstName) && lastName.equals(p.lastName));
	  }
	  
	  return false;
  }
  
  public int hashcode(){
	  return this.firstName.hashCode();
  }
  
  public int compareTo(Object o){
	  Person p = (Person)o;
	  int lastCmp = lastName.compareTo(p.getLastName());
	  if(lastCmp!=0){
		  return lastCmp;
	  }else{
		  return firstName.compareTo(p.getFirstName());
	  }
	  
  }
}
