package com.yxt.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TestList {
   public static void main(String[] args){
	   List<String> l1 = new ArrayList<String>();
	   for(int i=0;i<10;i++){
		   l1.add("a"+i);
	   }
	   System.out.println(l1);
	   Collections.shuffle(l1);
	   System.out.println("after shuffle:"+l1);
	   Collections.sort(l1);
	   System.out.println("after sort:"+l1);
	   Collections.reverse(l1);
	   System.out.println("after reverse:"+l1);
	   System.out.println("binary search:"+Collections.binarySearch(l1, "a5"));


	   
   }
}
