package com.yxt.exception;

public class TestMyException {
  public static void main(String[] args){
	  try {
		TestMyException.login();
	} catch (MyException e) {
		// TODO Auto-generated catch block
		System.out.println("find myException:"+e.getMessage());
		e.printStackTrace();
	}
  }
  
  public static void login() throws MyException{
	  System.out.println("user login");
	  throw new MyException("login exception");
  }
}


