package com.yxt.thread;


public class TestPriority {
   public static void main(String[] args){
	   Thread t1 = new Thread(new Runner5());
	   Thread t2 = new Thread(new Runner6());
	   t1.setPriority(Thread.NORM_PRIORITY+5);

	   t1.start();
	   t2.start();
   }
}

class Runner5 implements Runnable{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("t1:"+i);
            
            
		}
		
	}
}

class Runner6 implements Runnable{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("---------t2:"+i);
            
            
		}
		
	}
}