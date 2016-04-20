package com.yxt.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestBufferStream {
   public static void main(String[] args){
	   FileInputStream fis = null;
	   BufferedInputStream bis = null;
	   try {
		   fis = new FileInputStream("C://workspace//Java Study//src//com//yxt//io//TestFileInputStream.java");
		   bis = new BufferedInputStream(fis);
		   int b = 0;
		   while((b=bis.read())!=-1){
			   System.out.print((char)b);
		   }
		   fis.close();
		   bis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

   }
}
