package com.yxt.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestIterator {
   public static void main(String[] args){
	   Collection<Person> c = new HashSet<Person>();
	   c.add(new Person("hanson","yang"));
	   c.add(new Person("lee","yu"));
	   c.add(new Person("steve","huang"));
	   Iterator<Person> i = c.iterator();
	   while(i.hasNext()){
		   System.out.println(i.next());
	   }
	   
	   for(Iterator<Person> j = c.iterator();j.hasNext();){
		   Person p = (Person)j.next();
		   if(p.getFirstName().length()>3){
			   j.remove();
		   }
		   
	   }
	   
	   System.out.println(c);

   }
}
