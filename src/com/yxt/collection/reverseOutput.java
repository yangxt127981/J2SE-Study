package com.yxt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class reverseOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("output value without duplicated:"+ revOutputWithoutDup(3576));
        System.out.println("output value with duplicated:"+ revOutputWithDup(12234));


	}
	
	public static int revOutputWithoutDup(int num){
		
        String numStr = String.valueOf(num);
        //String to char list
        List<String> l1 = new ArrayList<String>();
        for (int i=0;i<numStr.length();i++){
        	l1.add(String.valueOf(numStr.charAt(i)));
        }
        // reverse list order
        Collections.reverse(l1);
        //string list to int
        String outPutString = "";
        for(int i=0;i<l1.size();i++){
            outPutString += l1.get(i);

        }
        
        return Integer.valueOf(outPutString);
	}

    public static int revOutputWithDup(int num){
		
        String numStr = String.valueOf(num);
        //String to char list
        TreeSet<String> t1 = new TreeSet<String>(new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
        	
        });
       
        
        for (int i=0;i<numStr.length();i++){
        	t1.add(String.valueOf(numStr.charAt(i)));
        }
       
        //string set to int
        String outPutString = "";
        Iterator<String> it = t1.iterator();
        while(it.hasNext()){
        	outPutString += it.next();
        }
        
        return Integer.valueOf(outPutString);
	}
	
}
