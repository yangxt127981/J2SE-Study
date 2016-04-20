package com.yxt.array;

public class ArrayCopy {
  public static void main(String[] args){
	  String [] s1={"HP","IBM","Apple","Oracle"};
	  String [] s2= new String[6];
	  System.arraycopy(s1, 0, s2, 0, s1.length);
	  for(int i=0;i<s2.length;i++){
		  System.out.println(s2[i]);
	  }
	  System.out.println();

	  s2[0]="Mircosoft";
	  for(int i=0;i<s1.length;i++){
		  System.out.println(s1[i]);
	  }
	  System.out.println();

	  for(int i=0;i<s2.length;i++){
		  System.out.println(s2[i]);
	  }
  }
}
