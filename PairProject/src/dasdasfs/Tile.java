package dasdasfs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

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
	
	public void paint(Graphics g, int xEff, int yEff) {
		Graphics2D g1d = (Graphics2D) g;
		g1d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g1d.setColor(color);
		g1d.fillRect(coordinateX+xEff, coordinateY+yEff, coordinateX+1+xEff, coordinateY+1+yEff);
	}
}
