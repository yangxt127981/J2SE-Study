package com.yxt.array;

public class TenToTwo {
	public static void main(String[] args){
		   int ten= 24;
		   int[] two =new int[8];
		   for(int i=0;ten>0;i++){
			   int y = ten % 2;
			 
			   two[i]=y;
	           ten= ten/2;
		   }
		   
		   for(int i=two.length-1;i>=0;i--){
			   System.out.print(two[i]);
		   }
	   }
}
