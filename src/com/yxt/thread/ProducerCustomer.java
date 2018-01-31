package com.yxt.thread;


public class ProducerCustomer {
   public static void main(String[] args){
	   Bucket b = new Bucket();
	   Producer p = new Producer(b);
	   Consumer c = new Consumer(b);
	   new Thread(p).start();

	   new Thread(c).start();
   }
	
}



class Bread{
	private int id;
	
	public Bread(int id){
		this.id = id;
	}
	
	public String toString(){
		return "bread:"+id;
	}
}


class Bucket{
	private int index = 0;
	private Bread[] breadArr = new Bread[6];
	public Bucket(){
		
	}

	public int getStorageSize(){
		return index;
	}
	// when execute sync method, get object lock ,another thread waiting in object lock  area
  // after finish execute sync method,release object lock, another thread waiting in object lock pool area can get lock
	public synchronized void push(Bread b){
		if(index==breadArr.length){
			try {
				this.wait();  // release current object lock, current thread go into current object waiting area
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		}
		this.notify(); // notify another thread which in current object lock waiting area to get object lock
		breadArr[index] = b;
		index++;
	}


	public synchronized Bread pop(){
        if(index==0){
        	try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        this.notify(); // notify another thread which in current object lock waiting area to get object lock
		index--;
		return breadArr[index]; 
	}
}


class Producer implements Runnable{
	
   private Bucket bucket= null;
   
   public Producer(Bucket b){
	   this.bucket = b;
   }
   
   public void run(){
	   for(int i=0;i<20;i++){
		   Bread b = new Bread(i);
		   try {
			bucket.push(b);
			System.out.println("produce:"+b+","+"size:"+bucket.getStorageSize());
			Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
   }
}


class Consumer implements Runnable{
	private Bucket bucket= null;
	   
	public Consumer(Bucket b){
		   this.bucket = b;
	   } 
	
	
	public void run(){
		   for(int i=0;i<20;i++){
			   try {
				Bread b = bucket.pop();
				System.out.println("consume:"+b+","+"size:"+bucket.getStorageSize());
                Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	   }
}