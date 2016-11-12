package com.yxt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapSort  {
   public static void main(String[] args) {
	   //treemap 默认key升序排列
	     MapSort.sortByKey();
	     MapSort.sortByValue();
	    }
   public static void sortByKey(){
	    	
	   Map<String, String> map = new TreeMap<String, String>(
		        		//add comparator implement desc sort 
		        		new Comparator<String>(){

							@Override
							public int compare(String o1, String o2) {
								// TODO Auto-generated method stub
								return o2.compareTo(o1);
							}
		        			 
		        		 }
		        		);
		        
		        map.put("3", "ccccc");
		        map.put("4", "aaaaa");
		        map.put("1", "bbbbb");
		        map.put("2", "ddddd");
		        System.out.println("-------map sort desc by key----");

		        Set<String> keySet = map.keySet();
		        Iterator<String> iter = keySet.iterator();
		        while (iter.hasNext()) {
		            String key = iter.next();
		            System.out.println(key + ":" + map.get(key));
		        }
		        
		        //another method iterator map
//		        Iterator<Entry<String, String>> it = map.entrySet().iterator();
//		        while (it.hasNext()) {
//		        	Entry<String,String> entry = it.next();
//		            System.out.println(entry.getKey() + ":" +entry.getValue());
//		        }
	    }
	    
	    
	public static void sortByValue(){
	    // sort by value
	     Map<String, String> map = new TreeMap<String, String>(
		        		//add comparator implement desc sort 
//		        		new Comparator<String>(){
//
//							@Override
//							public int compare(String o1, String o2) {
//								// TODO Auto-generated method stub
//								return o2.compareTo(o1);
//							}
//		        			 
//		        		 }
		        		);
		        
		        map.put("3", "ccccc");
		        map.put("4", "aaaaa");
		        map.put("1", "bbbbb");
		        map.put("2", "ddddd");
		        System.out.println("-------map sort by value----");

	    //这里将map.entrySet()转换成list
        List<Map.Entry<String,String>> list = new ArrayList<Map.Entry<String,String>>(map.entrySet());
        //然后通过比较器来实现排序
        Collections.sort(list,new Comparator<Map.Entry<String,String>>() {
            //升序排序
            public int compare(Entry<String, String> o1,
                    Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
            
        });
        
        for(Map.Entry<String,String> mapping:list){ 
               System.out.println(mapping.getKey()+":"+mapping.getValue()); 
          } 
    }
}
