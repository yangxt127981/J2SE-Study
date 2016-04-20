package com.yxt.thread;

public class TestThread1 {
  public static void main(String[] args){
	  Runner runner = new Runner();
	  //runner.run();
	  Thread thread = new Thread(runner);
	  thread.start();
	  for(int i=0;i<30;i++){
			System.out.println("main thread:"+i);
		}
  }
  
  
}


class Runner implements Runnable{
	
	
	public void run(){
		for(int i=0;i<30;i++){
			System.out.println("thread:"+i);
		}
	}
	
}