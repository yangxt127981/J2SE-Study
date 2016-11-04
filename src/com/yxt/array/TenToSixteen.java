package com.yxt.array;

public class TenToSixteen {
   public static void main(String[] args){
	   int ten= 5036;
	   char[] sixteen=new char[6];
	   for(int i=0;ten>0;i++){
		   int y = ten % 16;
		   char z;
		   if (y>9){
			    z =  (char) ((y-10)+'A');
		   }else{
			   z=(char) (y+'0');
		   }
		   sixteen[i]=z;
           ten= ten/16;
	   }
	   
	   for(int i=sixteen.length-1;i>=0;i--){
		   System.out.print(sixteen[i]);
	   }
   }
   
   
   
}
