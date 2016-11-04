package com.yxt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestObjectSort {
  public static void main(String[] args){
	  List<Person> l1 = new ArrayList<Person>();
	  l1.add(new Person("hanson","yang"));
	  l1.add(new Person("jack","yang"));
	  l1.add(new Person("yulin","lee"));
	  l1.add(new Person("steve","huang"));
	  l1.add(new Person("shi","ben"));
	  //element must implement comparable interface
	  Collections.sort(l1);
	  System.out.println(l1);

	  List<Integer> l2= new ArrayList<Integer>();
	  l2.add(5);
	  l2.add(15);
	  l2.add(105);
	  l2.add(4);
	  l2.add(55);
	  System.out.println("before sort:" +l2);
	  Collections.sort(l2);
	  System.out.println("after sort:" +l2);


  }
}
