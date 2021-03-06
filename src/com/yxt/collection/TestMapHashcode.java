package com.yxt.collection;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TestMapHashcode {
	public static void main(String[] args){
		try {
			SpringDetector.detectSpring(Groundhog.class);
			//SpringDetector.detectSpring(Groundhog2.class);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Groundhog {
	protected int number;
	public Groundhog(int n) {number =n;}
	public String toString(){
		return "Ground #"+ number;
	}
}
class Prediction {
	private static Random rand = new Random(47);
	private boolean shadow = rand.nextDouble()>0.5;
	public String toString(){
		if(shadow)
			 return "six more weeks of Winter";
		else
			return "Early Spring";
	}
}


class SpringDetector {
	public static <T extends Groundhog> void detectSpring(Class<T> type) throws Exception {
		   Constructor<T> ghog = type.getConstructor(int.class);
           Map<Groundhog,Prediction> map = new HashMap<Groundhog,Prediction>();
           for(int i=0;i<10;i++){
        	   map.put(ghog.newInstance(i), new Prediction());
           }
    	   System.out.println("map ="+map);
    	   Groundhog gh = ghog.newInstance(3);
    	   System.out.println("looking up prediction for" + gh);
    	   //hashmap's gh3's address != new gh3's address, so can't find. must overiride hashcode and equals method
    	   if(map.containsKey(gh))
    		   System.out.println(map.get(gh));
    	   else
    		   System.out.println("key not found:"+gh);
           
	}
}	
class Groundhog2 extends Groundhog {
	public Groundhog2(int n){ super(n);}
	public int hashCode(){ return number;}   //use number as object hashcode,hashcode same and then compare equals method
	public boolean equals(Object o){
		return o instanceof Groundhog2 &&
				(number == ((Groundhog2)o).number);
	}
}



	
