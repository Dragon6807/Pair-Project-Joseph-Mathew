package dasdasfs;
import java.awt.Color;
import java.util.*;

public class map {
	public ArrayList<ArrayList<Tile>> arrayMapY = new ArrayList<ArrayList<Tile>>();
	public ArrayList<Tile> arrayMapX = new ArrayList<Tile>();
	public ArrayList<Color> colorSc = new ArrayList<Color>();
	
	public map() {
		colorSc.clear();
		colorSc.add(Color.black);
		colorSc.add(Color.blue);
		colorSc.add(Color.cyan);
		colorSc.add(Color.darkGray);
		colorSc.add(Color.gray);
		colorSc.add(Color.green);
		colorSc.add(Color.lightGray);
		colorSc.add(Color.magenta);
		colorSc.add(Color.orange);
		colorSc.add(Color.pink);
		colorSc.add(Color.red);
		colorSc.add(Color.yellow);
		colorSc.add(Color.decode("#DEB887"));
	}
	
	public void create(){
		for (int y = 0; y<100;y++) {
			for (int x = 0; x<100;x++) {
				if (x%10==0 || y%10==0) {
					arrayMapX.add(new Tile(colorSc.get(0), x*9, y*9));
				}
				else {
					arrayMapX.add(new Tile(colorSc.get(12), x*9, y*9));
				}
			}
			//arrayMapY.add((ArrayList<Tile>) arrayMapX.clone());
			//arrayMapX.clear();
		}
	}
}
