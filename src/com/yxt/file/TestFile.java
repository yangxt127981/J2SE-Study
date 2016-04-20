package com.yxt.file;

import java.io.File;

public class TestFile {
  public static void main(String[] args){
	  File f = new File("D:/360Downloads");
	  System.out.println(f.getName());
	  tree(f,1);
  }
  
  public static void tree(File f, int level){
	  StringBuffer preStr=new StringBuffer("  ");
	  for(int i=0;i<level;i++){
		  preStr.append("     ");

	  }

	  File[] childs = f.listFiles();
	  for(int i=0;i<childs.length;i++){
		  System.out.println(preStr+childs[i].getName());
		  if(childs[i].isDirectory()){
			  tree(childs[i],level+1);
		  }
	  }
  }
}
