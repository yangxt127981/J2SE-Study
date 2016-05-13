package com.yxt.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestAnonymous {
    Frame f = new Frame("test");
    TextField tf = new TextField(10);
    Button b1 = new Button("Start");
    public TestAnonymous(){
    	f.add(b1,"North");
    	f.add(tf,"South");
    	b1.addActionListener(new ActionListener(){
    		private int i;
    		public void actionPerformed(ActionEvent e){
    			tf.setText(e.getActionCommand()+ ++i);
    		}
    	});
    	
    	f.addWindowListener(new WindowAdapter(){
    		public void windowClosing(WindowEvent e){
    			System.exit(0);
    		}
    	});
    	
    	f.pack();
    	f.setVisible(true);
    }
	public static void main(String[] args) {
         new TestAnonymous();
	}

}
