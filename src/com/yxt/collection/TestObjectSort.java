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
	  Collections.sort(l1);
	  System.out.println(l1);

  }
}
