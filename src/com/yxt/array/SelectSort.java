package com.yxt.array;

public class SelectSort {
   public static void main(String[] args){
	   int[] array = {5,2,7,4,1,9,10,8,6,3};
	   SelectSort sort = new SelectSort();
	   sort.print("before sort:",array);
	   sort.selectSort2(array);
	   sort.print("after sort", array);
   }
   
   
   public void selectSort(int[] array){
	   int temp;
	   for(int i=0; i<array.length; i++){
		   for(int j=i+1; j<array.length; j++){
			    if(array[i] > array[j]) {
			    	temp = array[i];
			    	array[i] = array[j];
			    	array[j] = temp;
			    }
		   } 
	   }
   }
   
   public void selectSort2(int[] array){
	   int temp;
	   int k;
	   for(int i=0; i<array.length; i++){
		   k=i;
		   for(int j=i+1; j<array.length; j++){
			    if(array[k] > array[j]) {
			    	k =j;
			    }
		   } 
		   if (k!=i){
			   temp = array[i];
			   array[i] = array[k];
			   array[k] = temp;
		   }
	   }
	   
   }
   
   public void print(String msg,int[] array){
	   System.out.print(msg+":");
	   for(int i=0; i<array.length; i++){
	     System.out.print(array[i]+",");
	   }
	   System.out.println();

   }
}
