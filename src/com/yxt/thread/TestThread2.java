package com.yxt.thread;

public class TestThread2 {
  public static void main(String[] args){
	  Runner1 runner = new Runner1();
	  //runner.run();
	  runner.start();
	  for(int i=0;i<30;i++){
			System.out.println("main thread:"+i);
		}
  }
  
 }

class Runner1 extends Thread{
	
	public void run(){
		for(int i=0;i<30;i++){
			System.out.println("thread:"+i);
		}
	}
	
}