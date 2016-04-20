package com.yxt.thread;

import java.util.Date;

public class TestJoin {
  public static void main(String[] args){
	  Runner3 runner = new Runner3();
	  Thread t = new Thread(runner,"hanson");
	  t.start();
	  try {
		t.join(); //wait t thread end and then run main thread
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  System.out.println("main thread");
  }
}


class Runner3 implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("thread name"+ this.getClass().toString());
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return;
		}
            
		}
		
	}
	
}