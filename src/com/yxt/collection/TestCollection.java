package com.yxt.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class TestCollection {
  public static void main(String[] args){
	  Collection c = new ArrayList();
	  //Collection c = new LinkedList();
	  //Collection c = new HashSet();

	  c.add(new Integer(112));
	  c.add(new String("dsfd"));
	  System.out.println(c);
	  
  }
}
