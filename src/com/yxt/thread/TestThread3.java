package com.yxt.thread;

public class TestThread3 {
   public static void main(String[] args){
	   Thread t = new Thread(new Runner7(),"hanson");
	   t.start();
	   for(int i=0;i<30;i++){
			System.out.println("main thread:"+i);
		}
   }
}


class Runner7 implements Runnable{
	
	public void run(){
		System.out.println("Thread name:"+Thread.currentThread().getName()+",Thread alive:"+Thread.currentThread().isAlive());
		for(int i=0;i<30;i++){
			System.out.println("thread:"+i);
		}
	}
	
}