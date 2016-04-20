package com.yxt.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
  private static final int ONE = 1;	
  public static void main(String[] args){
	  Map<String,Integer> m = new HashMap<String,Integer>();
	  for(int i=0;i<args.length;i++){
		  int freq = m.get(args[i])==null?0:m.get(args[i]);
		  m.put(args[i], freq ==0?ONE:freq+1);
	  }
	  System.out.println(m.size()+"distinct word find");
	  System.out.println(m);

  }
}
