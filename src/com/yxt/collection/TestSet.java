package com.yxt.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
  public static void main(String[] args){
	  Set<Person> s1 = new HashSet<Person>();
	  Person p1 = new Person("Jacy","lee");
	  Person p2 = new Person("hanson","yang");
	  Person p3 = new Person("steve","huang");
	// overide hashCode and euqals method, find it is a duplicated element, don't add to set
	  Person p4 = new Person("steve","huang"); 

	  s1.add(p1);
	  s1.add(p2);
	  s1.add(p3);
	  s1.add(p4);

	  System.out.println(s1);
	  System.out.println("p3.hashcode:"+p3.hashCode());
	  System.out.println("p4.hashcode:"+p4.hashCode());
	  System.out.println(p3.equals(p4));

	  	  
	  System.out.println("-------------treeset asc sort--------");

	  //hashset sort,default sort asc
	  TreeSet<Person> ts = new TreeSet<Person>(s1);
	  System.out.println("treeset:"+ts);
	  
	  //add comparator, default desc
	  
	  System.out.println("-------------treeset desc sort--------");

	  TreeSet<Person> ts2 = new TreeSet<Person>(new Comparator<Person>(){

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			  return o2.compareTo(o1);

		}
		  
	  });
      ts2.add(p1);
	  ts2.add(p2);
	  ts2.add(p3);
	  
	  Iterator<Person> it = ts2.iterator();
	  while(it.hasNext()){
		  System.out.println(it.next());
	  }


  }
}
