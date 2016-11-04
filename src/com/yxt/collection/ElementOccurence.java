package com.yxt.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ElementOccurence {
   public static void main(String[] args){
	   List<Integer> l1 = new ArrayList<Integer>();
	   List<Integer> l2 = new ArrayList<Integer>();
	   l1.add(2);
	   l1.add(6);
	   l1.add(4);
	   l1.add(5);
	   l1.add(6);
	   l1.add(6);
	   l1.add(2);
	   l1.add(5);
	   
	   l2.add(12);
	   l2.add(13);
	   l2.add(4);
	   l2.add(5);
	   l2.add(16);
	   l2.add(16);
	   
       System.out.println("\n例子1 - 计算'a'出现的次数");  
       System.out.println("a : " + Collections.frequency(l1, 2));  
  
       System.out.println("\n例子2 - 计算所有对象出现的次数");  
       Set<Integer> uniqueSet = new HashSet<Integer>(l1);  
       for (Integer temp : uniqueSet) {  
           System.out.println(temp + ": " + Collections.frequency(l1, temp));  
       }  
  
       System.out.println("\n例子3 -用Map来计算对象出现的次数");  
       Map<Integer,Integer> map = new HashMap<Integer,Integer>();  
  
       for (Integer temp : l1) {  
           Integer count = (Integer) map.get(temp);  
           map.put(temp, (count == null) ? 1 : count + 1);  
       }  
       printMap(map);  
  
       System.out.println("\nMap排序-以key排序");  
       Map treeMap = new TreeMap(map);  
       printMap(treeMap);  
	   
   }
		
   //public static List<Integer> getMaxOccurence(List<Integer> list){
//	   List<Integer> posList = new ArrayList<Integer>();
//	   Integer pos = 0;
//	   Integer num = 0;
//	   Map<Integer,Integer> map = new HashMap<Integer,Integer>();
////	   Iterator<Integer> it=set.iterator(); 
////	   while(it.hasNext()){ 
////	             System.out.println(it.next()); 
////	      } 
//	   
//	   for(int i=0;i<list.size();i++){
//		   int count =0;
//		   for(int j=0;j<list.size();j++){
//			   if (list.get(j)==list.get(i)){
//				   count++;
//			   }
//		   }
//		   map.put(i, count);
//	   }
//	   
//	   Iterator<Entry<Integer, Integer>> mapIt = map.entrySet().iterator();
//       while(mapIt.hasNext()){
//       	Entry<Integer,Integer> entry = mapIt.next();
//       	 if(num<=entry.getValue()){
//       		 num = entry.getValue();
//       	 }
//       }
//       
//       mapIt = map.entrySet().iterator();
//       while(mapIt.hasNext()){
//          	Entry<Integer,Integer> entry = mapIt.next();
//          	 if(num==entry.getValue()){
//          	    pos = entry.getKey();
//          		posList.add(pos);
//          	 }
//          }
//       
//	   return posList;
	   
	   
 //  }
   public static void printMap(Map map) {  
	   Iterator<Entry<Integer, Integer>> mapIt = map.entrySet().iterator();
	   while(mapIt.hasNext()){  
    	Entry<Integer,Integer> entry = mapIt.next();

           System.out.println("Key-value : " + entry.getKey() + "- "  
                   + entry.getValue());  
       }  
   }  
}
