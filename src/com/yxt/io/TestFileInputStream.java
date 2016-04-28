package com.yxt.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {
  public static void main(String[] args){
	  FileInputStream in = null;
	  try {
		 in = new FileInputStream("C://workspace//Java Study//src//com//yxt//io//TestFileInputStream.java");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		
		e.printStackTrace();
		System.out.println("dfdf");
		System.exit(-1);
		
	}
	  
	  int b =0;
	  try {
		while((b=in.read())!=-1){
			  System.out.print((char)b);
		  }
		in.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.exit(-1);

	}
	  
  }
}
