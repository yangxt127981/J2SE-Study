package com.yxt.memory;

public class MemoryAllocate {
   public static void main(String[] args){
	   MemoryAllocate ma = new MemoryAllocate();
	   int date = 9;
	   BirthDate d1 = new BirthDate(7,7,1970);
	   BirthDate d2 = new BirthDate(9,9,2000);
	   ma.change1(date);
	   ma.change2(d1);
	   ma.change3(d2);
	   System.out.println(date);
	   d1.display();
	   d2.display();

   }
   
   public void change1(int i){
	   i = 1234;
   }
   
   public void change2(BirthDate b){
	   b = new BirthDate(10,10,2008);
   }
   
   public void change3(BirthDate b){
	   b.setDay(22);;
   }
}
