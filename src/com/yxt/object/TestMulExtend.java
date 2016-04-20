package com.yxt.object;

public class TestMulExtend{
   public static void main(String[] args){
	   Valueable gm = new GoldenMonkey("monkey",100);
	   gm.money();
	   Protectable pt = (Protectable)gm;
	   pt.environment();
	   GoldenMonkey g = (GoldenMonkey)gm;
	   g.move();
	   
	   Comparable km = new GoldenMonkey("monkey",100);
	   System.out.print(km.compareTo(gm));

   }
}

class GoldenMonkey extends Animal implements Valueable, Protectable, Comparable{
	private String name;
	private int age;
	
	public GoldenMonkey(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void move(){
		System.out.println("goldenmonkey running");

	}
	
	public void money(){
		System.out.println("Money:10000");
	}
	
	public void environment(){
		System.out.println("live in mountain");

		
	}
	
	public int getAge(){
		return this.age;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof GoldenMonkey){
			GoldenMonkey g = (GoldenMonkey)o;
			if (this.age > g.age){
				return 1;
			}else if(this.age < g.age){
				return -1;
			}
		}
		return 0;
	}


}


interface Valueable{
	public void money();
}

interface Protectable{
	public void environment();
}