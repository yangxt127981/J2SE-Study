package com.yxt.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionObjEqual {
  public static void main(String[] args){
	  Collection<Person> c = new ArrayList<Person>();
	 
	  Person p = new Person("hanson","yang");
	  c.add(p);
	  System.out.println(c);
	  System.out.println("p hashcode:"+p.hashCode());
	
	  Person k = new Person("hanson","yang");
	  c.add(k);

	  System.out.println("k hashcode:"+k.hashCode());

	  System.out.println(p.equals(k));
	  System.out.println(c.remove(k));

	  System.out.println(c);

  }
}
