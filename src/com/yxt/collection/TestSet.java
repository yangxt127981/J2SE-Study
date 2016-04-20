package com.yxt.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
  public static void main(String[] args){
	  Set<Person> s1 = new HashSet<Person>();
	  Person p1 = new Person("hanson1","yang");
	  Person p2 = new Person("hanson","yang");
	  s1.add(p1);
	  s1.add(p2);
	  System.out.println(s1);
	  System.out.println(p1.hashcode());
	  System.out.println(p2.hashcode());
	  System.out.println(p1.equals(p2));

	  Iterator<Person> it=s1.iterator(); 
      while(it.hasNext()){ 
             System.out.println(it.next()); 
      } 
  }
}
