package com.yxt.collection;

import java.util.HashSet;
import java.util.Set;

public class TestSetHashcode {
	public static void main(String args[]){ 
		String s1=new String("zhaoxudong"); 
		String s2=new String("zhaoxudong"); 
		String s3 = "hello";
		String s4 = "hello";
		System.out.println(s1==s2);//false 
		System.out.println(s3==s4);//true 
		System.out.println("s3/s4equal:"+s3.equals(s4));//true 

		System.out.println("s1/s2equal:"+s1.equals(s2));//true 
		System.out.println(s1.hashCode());//s1.hashcode()等于s2.hashcode() 
		System.out.println(s2.hashCode()); 
		System.out.println(s3.hashCode());//s1.hashcode()等于s2.hashcode() 
		System.out.println(s4.hashCode());
		Set<String> hashset=new HashSet<String>(); 
		hashset.add(s1); 
		hashset.add(s2); 
		
	}
}
