package com.yxt.gui;

import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestKeyEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new KeyFrame().launchFrame();
	}

}

class KeyFrame extends Frame{
	public void launchFrame(){
		setSize(200,200);
		setLocation(300,300);
		setVisible(true);
		this.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_UP){
					System.out.println("up");
				}
			}
		});
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				setVisible(false);
				System.exit(0);
			}
		});
		
	}
}