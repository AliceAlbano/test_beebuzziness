package lcd;

//If, later, we need to change the size of a grid, maybe it could be better
//to add an abstract class Grid, and implement a concrete inherited Grid for each size
public class Grid {

	private Code[][] grid = new Code[3][3];
	
	public Grid(Symbol symbol) {
		//A partir d'un symbole, encode et construit la matrice
		//contiendra un switch sur les symboles à encoder
		
	}

	//To print on screen, we will need to print line by line for every grid
	//To avoid handling out of bounds calls, we define three methods to get the three lines of a grid
	public Code[] getGridFirstLine() {
		return null;
	}
	
	public Code[] getGridSecondLine() {
		return null;
	}
	
	public Code[] getGridThirdLine() {
		return null;
	}
}
