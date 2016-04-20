package com.yxt.thread;

import java.util.Date;

public class TestInterrupt {
  public static void main(String[] args){
	  Thread t = new Thread(new Runner2());
	  t.start();
	  try {
		Thread.sleep(11000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  t.interrupt();
  }
  
  
}

class Runner2 implements Runnable{
	public void run(){
		while(true){
			System.out.println(new Date());
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return;
		}
            
		}
		
	}
}