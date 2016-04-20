package com.yxt.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestTransform {
   public static void main(String[] args){
	   OutputStreamWriter osw = null;
	try {
		FileOutputStream os = new FileOutputStream("C://workspace//Java Study//src//com//yxt//io//test1.txt",true);
		osw = new OutputStreamWriter(os);
		System.out.println(osw.getEncoding());
		osw.write("hello world");
        osw.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
