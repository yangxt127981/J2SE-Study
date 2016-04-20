package com.yxt.thread;
/**m1 is locked, but still can access other method without lock**/
public class TestSync2 implements Runnable{
   private int m = 1000;
   
   public synchronized void m1(){
	   m = 500;
	   try {
		Thread.sleep(5000);
	   } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	   System.out.println("m1 m:"+m);
   }
   
   
   /**can access m2, m change to 2000, in order to make sure m value is correct
   must add lick for all methods include m*/
   public void m2(){
	   m=2000;
	   System.out.println("m2 m:"+m);

   }
   
   
   public void run(){
	   m1();
   }
   
   public static void main(String[] args){
	   TestSync2 ts= new TestSync2();
	   Thread t = new Thread(ts);
	   t.start();
//	   try {
//		Thread.sleep(1000);  //let main thread sleep, ts thread get chance to run
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	   
//	   System.out.println("-----access m2, m change to 2000-----");
	   
	   //if comments 35-42, result is m2 m:500, m2 execute 21 and ts thread execute 7
	   ts.m2();
   }
}
