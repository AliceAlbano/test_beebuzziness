package lcd;

// If, later, we need to change the size of a grid, maybe it could be better
// to add an abstract class Grid, and implement a concrete inherited Grid for each size
// since it changes the way we encode symbols
public class Grid {

	private Code[][] grid;
	
	public Grid(Symbol symbol) {

		switch (symbol) {
			case ZERO:	this.grid = new Code[][] {
								{Code.SPACE, Code.UNDERSCORE, Code.SPACE},
								{Code.PIPE, Code.SPACE, Code.PIPE},
								{Code.PIPE, Code.UNDERSCORE, Code.PIPE}};
						break;
		
			case ONE:	this.grid = new Code[][] {
								{Code.SPACE, Code.SPACE, Code.SPACE},
								{Code.SPACE, Code.SPACE, Code.PIPE},
								{Code.SPACE, Code.SPACE, Code.PIPE}};
						break;

			case TWO:	this.grid = new Code[][] {
								{Code.SPACE, Code.UNDERSCORE, Code.SPACE},
								{Code.SPACE, Code.UNDERSCORE, Code.PIPE},
								{Code.PIPE, Code.UNDERSCORE, Code.SPACE}};
						break;

			case THREE:	this.grid = new Code[][] {
								{Code.SPACE, Code.UNDERSCORE, Code.SPACE},
								{Code.SPACE, Code.UNDERSCORE, Code.PIPE},
								{Code.SPACE, Code.UNDERSCORE, Code.PIPE}};
						break;

			case FOUR:	this.grid = new Code[][] {
								{Code.SPACE, Code.SPACE, Code.SPACE},
								{Code.PIPE, Code.UNDERSCORE, Code.PIPE},
								{Code.SPACE, Code.SPACE, Code.PIPE}};
						break;

			case FIVE:	this.grid = new Code[][] {
								{Code.SPACE, Code.UNDERSCORE, Code.SPACE},
								{Code.PIPE, Code.UNDERSCORE, Code.SPACE},
								{Code.SPACE, Code.UNDERSCORE, Code.PIPE}};
						break;
					
			case SIX:	this.grid = new Code[][] {
								{Code.SPACE, Code.UNDERSCORE, Code.SPACE},
								{Code.PIPE, Code.UNDERSCORE, Code.SPACE},
								{Code.PIPE, Code.UNDERSCORE, Code.PIPE}};
						break;

			case SEVEN:	this.grid = new Code[][] {
								{Code.SPACE, Code.UNDERSCORE, Code.SPACE},
								{Code.SPACE, Code.SPACE, Code.PIPE},
								{Code.SPACE, Code.SPACE, Code.PIPE}};
						break;

			case EIGHT:	this.grid = new Code[][] {
								{Code.SPACE, Code.UNDERSCORE, Code.SPACE},
								{Code.PIPE, Code.UNDERSCORE, Code.PIPE},
								{Code.PIPE, Code.UNDERSCORE, Code.PIPE}};
						break;
					
			case NINE:	this.grid = new Code[][] {
								{Code.SPACE, Code.UNDERSCORE, Code.SPACE},
								{Code.PIPE, Code.UNDERSCORE, Code.PIPE},
								{Code.SPACE, Code.SPACE, Code.PIPE}};
						break;
						
			case EMPTY:	this.grid = new Code[][] {
								{Code.SPACE, Code.SPACE, Code.SPACE},
								{Code.SPACE, Code.SPACE, Code.SPACE},
								{Code.SPACE, Code.SPACE, Code.SPACE}};
						break;
			

			default:	throw new IllegalArgumentException();
	}
		
	}

	// To print on screen, we will need to print line by line for every grid
	// To avoid handling out of bounds calls, we define three methods 
	// to get the three lines of a grid
	
	public Code[] getGridFirstLine() {
		return this.grid[0];
	}
	
	public Code[] getGridSecondLine() {
		return this.grid[1];
	}
	
	public Code[] getGridThirdLine() {
		return this.grid[2];
	}
}
