package com.yxt.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestObjectIO {
  public static void main(String[] args){
	  T t = new T();
	  t.age = 18;
	  try {
		FileOutputStream fos = new FileOutputStream("d://git//J2SE-Study//src//com//yxt//io//testObject.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t);
		FileInputStream fis = new FileInputStream("d://git//J2SE-Study//src//com//yxt//io//testObject.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);
		T obj = (T)ois.readObject();
		System.out.println(obj.name+","+obj.age+","+obj.address+","+obj.country);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}


class T implements Serializable{
  String name = "hanson";
  int age=29;
  String address = "wuhan";
   transient String country ="China";
}