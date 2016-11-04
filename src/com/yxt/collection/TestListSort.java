package com.yxt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestListSort {
  public static void main(String[] args){
	  List<Person> l1 = new ArrayList<Person>();
	  l1.add(new Person("hanson","yang"));
	  l1.add(new Person("jack","yang"));
	  l1.add(new Person("yulin","lee"));
	  l1.add(new Person("steve","huang"));
	  l1.add(new Person("shi","ben"));
	
//
//	  List<Integer> l2= new ArrayList<Integer>();
//	  l2.add(5);
//	  l2.add(15);
//	  l2.add(105);
//	  l2.add(4);
//	  l2.add(55);
//	  System.out.println("before sort:" +l2);
//	  Collections.sort(l2);
//	  System.out.println("after sort:" +l2);
	  TestListSort.sortByArrayList(l1);
	  TestListSort.sortByCollections(l1);

  }
  
  public static void sortByCollections(List<Person> l1){
	  //element must implement comparable interface
	  
	  Collections.sort(l1);
	  System.out.println("sort by Collections:");

	  System.out.println(l1);
  }
  
  public static void sortByArrayList(List<Person> l1){

	  //by arraylist sort method
	  l1.sort(new Comparator<Person>(){

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			  int lastCmp = (o2.getLastName()).compareTo(o1.getLastName());
			  if(lastCmp!=0){
				  return lastCmp;
			  }else{
				  return (o2.getFirstName()).compareTo(o1.getFirstName());
			  }		}
	     
	  });
	  System.out.println("arraylist sort:");

	  System.out.println(l1);
  }
}
