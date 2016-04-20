package com.yxt.array;

public class BinarySearch {
  public static void main(String[] args){
	  int a[] = {1,3,6,8,9,13,14,19,25,33,45};
	  int i = 25;
	  System.out.println(binarySearch(a,i));
	  System.out.println(search(a,i));

  }
  
  public static int binarySearch(int a[],int i){
	  if(a.length==0){
		  return -1;
	  }
	  int startPos = 0;
	  int endPos = a.length - 1;
	  int midPos = (startPos + endPos) / 2;
	  while(startPos <= endPos){
		  if(a[midPos] == i){
			  return midPos;
		  }
		  if(a[midPos] < i){
			  startPos = midPos +1;
		  }
		  
		  if(a[midPos] > i){
			  endPos = midPos -1;
		  }
		  midPos = (startPos + endPos) / 2;
	  }
	  return -1;
  }
  
  public static int search(int a[], int i){
	  for(int j=0;j<a.length;j++){
		  if(a[j]==i){
			  return j;
		  }
	  }
	  return -1;
  }
}
