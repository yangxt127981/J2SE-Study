package com.yxt.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestMapHashcode2 {
    public static void main(String[] args){
    	Map<Identity,Dog> personDetail = new HashMap<Identity,Dog>();
        Dog d1 = new Dog("mike");
        Dog d2 = new Dog("jim");
        Identity i1 = new Identity("001");
        Identity i2 = new Identity("002");
        Identity i3 = new Identity("001");
        System.out.println("i1 hashcode"+i1.hashCode());
        System.out.println("i2 hashcode"+i2.hashCode());
        System.out.println("i3 hashcode"+i3.hashCode());

        personDetail.put(i1, d1);
        personDetail.put(i2, d2);
        personDetail.remove(i3);  //if not override hashcode and equals method, cannot remove 001 from hash map.
        
        //1.iterator
    	System.out.println("---------------entryset display-------------");

        Iterator<Entry<Identity, Dog>> it = personDetail.entrySet().iterator();
        while(it.hasNext()){
        	Entry<Identity,Dog> entry = it.next();
        	System.out.println(entry.getKey()+":"+entry.getValue());
        }
        
        //2.entryset
        System.out.println("---------------keyset display-------------");
        Set<Identity> keySet = personDetail.keySet();
        Iterator<Identity> iter = keySet.iterator();
        while (iter.hasNext()) {
        	Identity key = iter.next();
            System.out.println(key + ":" + personDetail.get(key));
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
	
 	public int hashCode(){ return Integer.valueOf(id);}   //make object with same id has same hashcode

	
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