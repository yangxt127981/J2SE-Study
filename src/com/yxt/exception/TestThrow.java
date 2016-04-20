package com.yxt.exception;

import java.io.IOException;

public class TestThrow {
  public void divide(int i) throws MyException{
	  if(i==0){
		  throw new MyException("divide 0 exception");
	  }
  }
  
  public static void main(String[] args){
	  TestThrow tt =new TestThrow();
	  try {
		tt.divide(0);
	} catch (MyException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		
		e.printStackTrace();
	}
  }
}
