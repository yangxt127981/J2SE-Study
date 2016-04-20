package com.yxt.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class TestDataStream {
  public static void main(String[] args){
	  ByteArrayOutputStream baos = new ByteArrayOutputStream();
	  DataOutputStream dos = new DataOutputStream(baos);
	  try{
		  dos.writeDouble(1234567890);
		  dos.writeBoolean(true);
		  dos.writeChars("h");
		  ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		  DataInputStream dis = new DataInputStream(bais);
		  System.out.println(dis.available());

		  System.out.println(dis.readDouble());
		  System.out.println(dis.readBoolean());
		  System.out.println(dis.readChar());

		  
	  }catch(IOException e){
		  e.printStackTrace();
	  }
  }
}
