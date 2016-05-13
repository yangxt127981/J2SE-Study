package com.yxt.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class MyMouseAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MyFrame("Drawing.....");
	}

}

class MyFrame extends Frame{
	
	ArrayList<Point> points = null;
	
	MyFrame(String s){
		super(s);
		points = new ArrayList<Point>();
		setLayout(null);
		setBounds(300,300,400,300);
		this.setBackground(new Color(204,204,255));
		setVisible(true);
		this.addMouseListener(new Monitor1());
		/*Anonymous class*/
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				setVisible(false);
				System.exit(0);
			}
			
		});
		
	}
	
	public void paint(Graphics g){
		Iterator<Point> i = points.iterator();
		while(i.hasNext()){
			Point p = (Point)i.next();
			g.setColor(Color.blue);
			g.fillOval(p.x, p.y, 10, 10);
		}
	}
	
	public void addPoint(Point p){
		points.add(p);
	}
	/*use inner class to close window
	class WindowMonitor extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			setVisible(false);
			System.exit(0);
		}
	}*/
}

/**why not implement MouseListener, MuseListene has many methods, need to implement all
 * MouseAdapter implement these methods, methods detail is null **/
class Monitor1 extends MouseAdapter{
	public void mousePressed(MouseEvent e){
		MyFrame f =(MyFrame)e.getSource();
		f.addPoint(new Point(e.getX(),e.getY()));
		f.repaint();
		
	}
}