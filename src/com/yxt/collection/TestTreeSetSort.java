package com.yxt.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TestTreeSetSort {
   public static void main(String[] args){
	   //define comparator, sort desc, default asc
	   TreeSet<Person> ts = new TreeSet<Person>(new Comparator<Person>(){

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			
			  int lastCmp = o2.getLastName().compareTo(o1.getLastName());
			  if(lastCmp!=0){
				  return lastCmp;
			  }else{
				  return o2.getFirstName().compareTo(o1.getFirstName());
			  }		}
		   
	   });
	   
	   ts.add(new Person("hanson","yang"));
	   ts.add(new Person("jack","yang"));
	   ts.add(new Person("yulin","lee"));
	   ts.add(new Person("steve","huang"));
	   ts.add(new Person("shi","ben"));
	  
	   Iterator<Person> it = ts.iterator();
	   while(it.hasNext()){
		   System.out.println(it.next());
	   }
	   
	   List<Person> li = new ArrayList<Person>(ts);
	   for(int i=0;i<li.size();i++){
		   System.out.println(li.get(i));
	   }
   }
   
  
}
