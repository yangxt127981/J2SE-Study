package com.yxt.array;

public class BubbleSort {

	public static void main(String[] args){
		Date[] dataArr = new Date[5];
		dataArr[0] = new Date(2010,10,21);
		dataArr[1] = new Date(2006,10,21);
		dataArr[2] = new Date(2006,12,21);
		dataArr[3] = new Date(2003,3,21);
		dataArr[4] = new Date(2000,9,21);
		BubbleSort bs = new BubbleSort();
		bs.print("before sort", dataArr);
		bs.bubbleSort(dataArr);
		bs.print("after sort", dataArr);
		System.out.println(binarySearch(dataArr, dataArr[2]));

	}
	
	public void bubbleSort(Date[] arr){
		Date tmp = new Date();
		for(int i=arr.length; i>1; i--){
			for(int j=0;j<i-1;j++ ){
				if(arr[j].compare(arr[j+1])==1){
					tmp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	
	public void print(String msg,Date[] array){
		   System.out.print(msg+":");
		   for(int i=0; i<array.length; i++){
		     System.out.print(array[i]+",");
		   }
		   System.out.println();

	   }
	
	 public static int binarySearch(Date[] arr,Date d){
		  if(arr.length==0){
			  return -1;
		  }
		  int startPos = 0;
		  int endPos = arr.length - 1;
		  int midPos = (startPos + endPos) / 2;
		  while(startPos <= endPos){
			  if(arr[midPos].compare(d) == 0){
				  return midPos;
			  }
			  if(arr[midPos].compare(d) == -1){
				  startPos = midPos +1;
			  }
			  
			  if(arr[midPos].compare(d) == 1){
				  endPos = midPos -1;
			  }
			  midPos = (startPos + endPos) / 2;
		  }
		  return -1;
	  }
}

class Date{
	private int y;
	private int m;
	private int d;
	
	public Date(){
	
	}
	public Date(int y, int m, int d){
		this.y=y;
		this.m=m;
		this.d=d;
	}
	
	public int compare(Date date){
		return y>date.y?1:
			   y<date.y?-1:
			   m>date.m?1:
			   m<date.m?-1:
			   d>date.d?1:
			   d<date.d?-1:0;
	}
	
	public String toString(){
		return y+"-"+m+"-"+d;
	}
}