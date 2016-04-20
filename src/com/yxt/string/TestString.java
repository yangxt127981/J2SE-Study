package com.yxt.string;

public class TestString {
   public static void main(String[] args){
	   String s1="syuishqwlSDFBNHJSNY33467%@#$";
	   int upperCount =0;
	   int lowerCount =0;
	   for(int i=0;i<s1.length();i++){
		   char c = s1.charAt(i);
		   if(Character.isLowerCase(c)){
			   lowerCount++;
		   }else if(Character.isUpperCase(c)){
			   upperCount++;
		   }
	   }
	   
	   System.out.println("upper:"+upperCount);
	   System.out.println("lower:"+lowerCount);
      
	   upperCount =0;
	   lowerCount =0; 
	   String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	   String lower="abcdefghijklmnopqrstuvwxyz";
	   for(int i=0;i<s1.length();i++){
		   char c = s1.charAt(i);
		   if(lower.indexOf(c)!=-1){
			   lowerCount++;
		   }else if(upper.indexOf(c)!=-1){
			   upperCount++;
		   }
	   }
	   System.out.println("*************************************************");
	   System.out.println("upper:"+upperCount);
	   System.out.println("lower:"+lowerCount);
	   
	   System.out.println("********************string appear count*****************************");
	   
	   String s2 = "dfdfdfjavaJavaDFerfdgJava";
	   System.out.println("java appear count:"+getAppearCount("java",s2));

   }
   
   public static int getAppearCount(String s,String s2){
	   int count =0;
	   s2 = s2.toLowerCase();
	   while(s2.indexOf("java")!=-1){
		   s2 = s2.substring(s2.indexOf("java")+4);
		   count++;
	   }
	   
	   return count;
   }
}
