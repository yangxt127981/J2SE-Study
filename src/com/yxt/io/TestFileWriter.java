package com.yxt.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
   public static void main(String[] args){
	   FileWriter fw = null;
	   FileReader fr = null;

	   try {
			fr = new FileReader("d://git//J2SE-Study//src//com//yxt//io//test.txt");
			fw = new FileWriter("d://git//J2SE-Study//src//com//yxt//io//test1.txt");
			int b =0;
			while((b=fr.read())!=-1){
				fw.write(b);
			}
			fr.close();
			fw.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
   }
}
