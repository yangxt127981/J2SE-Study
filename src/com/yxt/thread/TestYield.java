package com.yxt.thread;

public class TestYield {
   public static void main(String[] args){
	   Runner4 t1 = new Runner4("t1");
	   Runner4 t2 = new Runner4("t2");

	   t1.start();
	   t2.start();
	  
   }
}


class Runner4 extends Thread{
	public Runner4(String name){
		super(name);
	}
	
	public void run(){
		for (int i=0;i<50;i++){
		     System.out.println(getName()+":"+i);
			if(i%10==0){
				yield();  //give up current CPU schedule, give other thread chance to run
			}
		}
            
		
		
	}
	
}