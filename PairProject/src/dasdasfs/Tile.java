package dasdasfs;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;;

public class Tile {
	public int color;
	public int coordinateX;
	public int coordinateY;
	
	public Tile(int co, int corx, int cory) {
		color = co;
		coordinateX = corx;
		coordinateY = cory;
	}
	
	public void paint(Graphics g) {
		g.drawRect(coordinateX, coordinateY, coordinateX+50, coordinateY+50);
	}
}
