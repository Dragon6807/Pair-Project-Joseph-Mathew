package dasdasfs;
import java.awt.Color;
import java.util.*;

public class map {
	public ArrayList<Tile> arrayMap = new ArrayList();
	public ArrayList<Color> colorSc = new ArrayList();
	
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
	}
	
	public void create(){
		int cout = 0;
		for (int y = 0; y<8;y++) {
			for (int x = 0; x<8;x++) {
				if (cout==12) {
					cout=0;
				}
				arrayMap.add(new Tile(colorSc.get(cout), y*50, x*50));
				cout++;
			}
		}
	}
}
