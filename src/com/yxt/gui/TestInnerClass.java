package com.yxt.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestInnerClass {
	
	public static void main(String[] args){
		TFrame tf = new TFrame();
		tf.lanuchFrame();
	}
}

class TFrame extends Frame{
	TextField num1,num2,num3;
	public void lanuchFrame(){
		num1 = new TextField(10);
		num2 = new TextField(10);
		num3 = new TextField(10);
		Label lblPlus = new Label("+");
		Button btnEqual = new Button("=");
		/* method 1, get num value by attribute*/
		//btnEqual.addActionListener(new MyMonitor(num1,num2,num3)); 
		//pass refer to action class
		btnEqual.addActionListener(new MyMonitor(this));
		setLayout(new FlowLayout());
		add(num1);
		add(lblPlus);
		add(num2);
		add(btnEqual);
		add(num3);
        pack();
        setVisible(true);


	}
	
}

class MyMonitor implements ActionListener{
//	TextField num1,num2,num3;
//
//	public MyMonitor(TextField  num1,TextField num2,TextField num3){
//    	this.num1 = num1;
//    	this.num2 = num2;
//    	this.num3 = num3;
//    }
	TFrame tf = null;
	public MyMonitor(TFrame tf){
		this.tf = tf;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
//       int n1 = Integer.parseInt(num1.getText());
//       int n2 = Integer.parseInt(num2.getText());
//       num3.setText(""+(n1+n2));
		
		  int n1 = Integer.parseInt(tf.num1.getText());
	      int n2 = Integer.parseInt(tf.num2.getText());
	       tf.num3.setText(""+(n1+n2));
    		   
   }
	
}