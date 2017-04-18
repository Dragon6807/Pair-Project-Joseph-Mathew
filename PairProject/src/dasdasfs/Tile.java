package dasdasfs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;;

public class Tile {
	public Color color;
	public int coordinateX;
	public int coordinateY;
	
	public Tile(Color co, int corx, int cory) {
		color = co;
		coordinateX = corx;
		coordinateY = cory;
	}
	
	public void paint(Graphics g) {
		Graphics2D g1d = (Graphics2D) g;
		g1d.setColor(color);
		g1d.fillRect(coordinateX, coordinateY, coordinateX+3, coordinateY+3);
	}
}
