package lcd;

//On suppose que notre écran utilisé ici fait 10 de large
public class LCDScreen extends Screen {
	
	private int width = 10;
	
	private Grid[] screen = new Grid[width];
	
	public void setLCDScreen(Grid[] grid) {
		//Remplit les grids de l'écran avec des symboles encodés
	}
	
	public void printLCDScreen() {
		//appelle printGrid
		
	}
}
