package com.yxt.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetHashcode2 {
	public static void main(String[] args) 
    { 
         Set<Student> hs=new HashSet<Student>(); 
         hs.add(new Student(1,"zhangsan")); 
         hs.add(new Student(2,"lisi")); 
         hs.add(new Student(3,"wangwu")); 
         hs.add(new Student(1,"zhangsan")); //if not override hashcode, equals method, will add two zhangsan, as object reference different
  
         Iterator<Student> it=hs.iterator(); 
         while(it.hasNext()){ 
                System.out.println(it.next()); 
         } 
     } 
} 


class Student{ 
     int num; 
     String name; 
     public Student(int num,String name){ 
         this.num=num; 
         this.name=name; 
       } 
     public String toString(){ 
          return num+":"+name; 
        } 
 	public int hashCode(){ return name.hashCode();}   //same string has same hashcode

     public boolean equals(Object obj){
   	  if(obj instanceof Student){
   		  Student p = (Student)obj;
             return (name.equals(p.name));
   	  }
   	  
   	  return false;
     }


}    
 

