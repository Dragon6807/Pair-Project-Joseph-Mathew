package dasdasfs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.ImageObserver;

import javax.swing.JTextField;

import java.util.Random;
import java.lang.Math;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class MainWindow extends JPanel implements 
		MouseListener{
	private static JPanel play;
	private static int resCount = 0;
	Random rand = new Random();
	static JFrame frame;
	static map mappy;
	
	MainWindow() {
		super();
	}
	
	
	public void reset() {
		resCount++;
		frame.dispose();
		frame = new JFrame("Fun Game!");
	    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    play.setPreferredSize(new Dimension(640, 480));
	    frame.getContentPane().add(play, BorderLayout.CENTER);
	    JPanel buttonsPanel = new JPanel();
	    JButton clearButton = new JButton("Reset");
	    buttonsPanel.add(clearButton);
	    frame.getContentPane().add(buttonsPanel, BorderLayout.SOUTH);
	    clearButton.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		if (resCount == 11) {
	        			resCount = -1;
	        		}
	        		//play.reset();
	        	}
	    	});
	    frame.pack();
	    frame.setVisible(true);
	    
	}

	
	
	public void paintComponent(Graphics g){
	    /*super.paintComponent(g);
	    Tile update;
	    for (int cout = 0; cout<10000;cout++) {
			update = mappy.arrayMap.get(cout);
			update.paint(g);
		}*/
	}
	
	public static void main(String[] args) {
		play = new JPanel();
		play.setBackground(Color.black);
		mappy = new map();
		mappy.create();
		frame = new JFrame("Fun Game!");
	    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    play.setPreferredSize(new Dimension(640, 480));
	    frame.getContentPane().add(play, BorderLayout.CENTER);
	    JPanel buttonsPanel = new JPanel();
	    JButton clearButton = new JButton("Reset");
	    buttonsPanel.add(clearButton);
	    frame.getContentPane().add(buttonsPanel, 
	    		BorderLayout.SOUTH);
	    clearButton.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		//play.reset();
	        	}
	    	});
	    frame.pack();
	    frame.setVisible(true);
	   // waiting.start();
	}
	private int control = 0;
	
	@Override
	public void mouseClicked(MouseEvent arg0) {}
	@Override
	public void mouseEntered(MouseEvent arg0) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	@Override
	public void mousePressed(MouseEvent arg0) {
		control=0;
	}
	@Override
	public void mouseReleased(MouseEvent me) {
		if (control==0) {
			control++;
			
		}
	}
}
