package com.yxt.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Frame f = new Frame("test");
        Button b = new Button("press me");
        Monitor bh = new Monitor();
        b.addActionListener(bh);
        f.add(b,BorderLayout.CENTER);
        f.pack();
        f.setVisible(true);
	}

}
class Monitor implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("a button has been pressed");
	}
}