package com.yxt.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
  public static void main(String[] args){
	  FileReader fr = null;
	  try {
		fr = new FileReader("C://workspace//Java Study//src//com//yxt//io//test.txt");
		int b = 0;
		while((b=fr.read())!=-1){
			System.out.print((char)b);
		}
		fr.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
