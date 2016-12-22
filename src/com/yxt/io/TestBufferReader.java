package com.yxt.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferReader {
	   public static void main(String[] args){
		   BufferedReader br = null;
		   FileReader fr =null;
		try {
			fr = new FileReader("d://git//J2SE-Study//src//com//yxt//io//test.txt");
			br = new BufferedReader(fr);
			String s = null;
			while((s=br.readLine())!=null){
				System.out.println(s);
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
