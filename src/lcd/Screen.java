package lcd;


//Une classe écran générique, sans spécification de largeur
//Il sera ainsi facile par la suite d'utilise de nouveaux écrans avec des caractéristiques différentes
public abstract class Screen {

	private int width;
	
	public int getWidth() {
		return this.width;
	}
	
}
