package com.yxt.thread;
/** timer num is sync resource*/
public class TestSync implements Runnable {
   Timer timer = new Timer();
   
   public static void main(String[] args){

	   TestSync ts = new TestSync();
	   Thread t1 = new Thread(ts);
	   Thread t2 = new Thread(ts);
	   t1.start();
	   t2.start();
   }
   public void run(){
	   timer.add(Thread.currentThread().getName());
   }
}


class Timer{
	
  private static int num = 0;
  //execute the method, current object is locked,other thread can't access the method. must wait for the method execute finish
  public synchronized void add(String name){
	  //synchronized(this){
	  num++;
	  try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  System.out.println("you are "+num+" user");
	 // }
  }
	
}