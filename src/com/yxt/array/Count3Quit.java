package com.yxt.array;

public class Count3Quit {
   public static void main(String[] args){
	   boolean[] bl = new boolean[500];
	   for(int i=0;i<bl.length;i++){
		   bl[i]=true;
	   }
	   count(bl);
	   for(int i=0;i<bl.length;i++){
		   if(bl[i]==true){
		   System.out.println(i);
		   }
	   }
   }
   
   
   public static void count(boolean[] bl){
	   int leftNum = 500;
	   int count =0;
	   int index = 0;
	   while(leftNum>1){
		   
		   if(bl[index]==true){
			   count++;
			   if(count==3){
				   bl[index] =false;
				   count = 0;
				   leftNum--;
			   }
			   
		   }
		   index++;
		   if(index == bl.length){
			   index = 0;
		   }
		   
	   }
   }
}
