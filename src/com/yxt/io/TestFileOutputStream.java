package com.yxt.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
   public static void main(String[] args){
	   FileInputStream in = null;
	   FileOutputStream out = null;
	   try {
			in = new FileInputStream("d://git//J2SE-Study//src//com//yxt//io//TestFileInputStream.java");
			out = new FileOutputStream("d://git//J2SE-Study//src//com//yxt//io//test.txt");
		    int b=0;
			while((b=in.read())!=-1){
		    	out.write(b);
		    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
}
