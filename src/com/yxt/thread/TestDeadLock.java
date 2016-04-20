package com.yxt.thread;
/**sync code block: after execute complete, release resource.**/
public class TestDeadLock implements Runnable {
  private int flag =1;
  private static Object r1 = new Object();
  private static Object r2 = new Object();

  public void run(){
	System.out.println("flag="+flag);

	  if(flag==0){
		  synchronized(r1){
			  try {
				System.out.println("lock r1");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  synchronized(r2){
				  System.out.println("lock r2");
			  
		     }		  
		  }
		  
	  }
	  
	  if(flag ==1){
		  synchronized(r2){
			  try {
				System.out.println("lock r2");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  synchronized(r1){
				  System.out.println("lock r1");
			  
		     }
			  		  
		  }
		 
	  }
  }
  
  public static void main(String[] args){
	  TestDeadLock td1 = new TestDeadLock();
	  td1.flag = 0;
	  TestDeadLock td2 = new TestDeadLock();
	  td2.flag = 1;
      Thread t1 = new Thread(td1);
      Thread t2 = new Thread(td2);
      t1.start();
      t2.start();
  }
}
