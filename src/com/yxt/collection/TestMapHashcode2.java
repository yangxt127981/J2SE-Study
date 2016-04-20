package com.yxt.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestMapHashcode2 {
    public static void main(String[] args){
    	Map<Identity,Dog> personDetail = new HashMap<Identity,Dog>();
        Dog d1 = new Dog("mike");
        Dog d2 = new Dog("jim");
        personDetail.put(new Identity("001"), d1);
        personDetail.put(new Identity("002"), d2);
        personDetail.remove(new Identity("001"));  //if not overrider hashcode and equals method, can remove 001 from hash map.
        Iterator<Entry<Identity, Dog>> it = personDetail.entrySet().iterator();
        while(it.hasNext()){
        	Entry<Identity,Dog> entry = it.next();
        	System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
	
}


class Identity{
	private String id;
	public Identity(String id){
		this.id = id;
	}
	public String toString(){
		return "id:"+this.id;
	}
	
 	public int hashCode(){ return Integer.valueOf(id);}   //same string has same hashcode

	
	public boolean equals(Object obj){
    	
	    if (obj instanceof Identity){
	    	if (this.id == ((Identity) obj).id){
	    		return true;
	    	}
	    }
	    
	    return false;
    }
 
}


class Dog{
	private String name;
	public Dog(String name){
		this.name = name;
	}
	public String toString(){
		return "name:"+this.name;
	}
	
    
	
}