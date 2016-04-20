package com.yxt.object;

public class TestEquals {
  public static void main(String[] args){
	  Cat cat1 = new Cat(1,2,3);
	  Cat cat2 = new Cat(1,2,3);
	  Person person = new Person(1,2,3);
      System.out.println(cat1==cat2);
      System.out.println(cat1.equals(person));
      System.out.println(cat1.equals(cat2));

  }
}

class Cat{
	int height;
	int weight;
	int color;
	
	public Cat(int height,int weight,int color){
		this.height = height;
		this.weight = weight;
		this.color = color;
	}
	//override Object equals method
	public boolean equals(Object o){
		if (o==null){
			return false;
		}else{
			if (o instanceof Cat){
				Cat c = (Cat)o;
				if(c.color==this.color && c.height==this.height && c.weight==this.weight){
					return true;
				}
			}
			
		}
		
		return false;
	}
}

class Person{
    int height;
	int weight;
	int gender;
	public Person(int height,int weight,int gender){
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}
}