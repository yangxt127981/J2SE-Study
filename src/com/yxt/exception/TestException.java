package com.yxt.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException {
  public void f() throws FileNotFoundException, IOException{
	  FileInputStream in = new FileInputStream("sd.txt");
	  int b;
	  b = in.read();
	  while(b!= -1){
		  System.out.println((char)b);
		  b=in.read();
	  }
  }
  
  public void m()throws FileNotFoundException, IOException{
	 
	  f();
  }
  
  public static void main(String args[]){
	  TestException te  = new TestException();
	  try {
		te.m();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found");
			e.printStackTrace();
			e.getMessage();
		}catch (IOException e){
			System.out.println("IO exception");
	
		}finally{
			System.out.println("close file");

		}
  }
}
