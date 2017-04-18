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

import javax.imageio.ImageIO;
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
import java.io.IOException;
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
	static int mapX = 0;
	static int mapY = 0;
	
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
	    super.paintComponent(g);
	    Graphics2D g2d = (Graphics2D) g;
	    Tile update;
	    
	    for (int couty = 0; couty<10000;couty++) {
	    	//for (int coutx = 0; coutx<100;coutx++) {

				update = mappy.arrayMapX.get(couty);
	    		//update = (Tile) gr.get(0);
				update.paint(g, -50, 0);
			//}
		}
	    try {
			g2d.drawImage(ImageIO.read(getClass().getResource("../images/idle_R.png")), 200, 200, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		play = new MainWindow();
		//play.setBackground(Color.black);
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
