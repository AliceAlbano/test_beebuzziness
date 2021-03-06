package lcd;


public class ScreenController {

	private Grid[] gridArray;
	private Screen screen;
	private int screenWidth;
	
	public ScreenController(Screen s) {
		this.screen = s;
		this.screenWidth = s.getWidth();
	}
	
	// If we want to test this method, we need to use black-box testing or Mock
	// classes, as it is a void-returning function.
	public void printSymbolString(SymbolString symbolString) {
		
		int lengthString = symbolString.getSymbolString().length;
		
		int lengthGridArray = Math.min(lengthString, screenWidth);
		gridArray = new Grid[lengthGridArray];
		
		int i;
		
		// If the string to print is too long for the screen, we only print the
		// same number of characters as the width of the screen
		// If an other behavior is required, we should raise an exception
		for (i = 0; ((i < lengthString) && (i < screenWidth)) ; i ++) {
			gridArray[i] = new Grid(symbolString.getSymbolString()[i]);
		}
		
		screen.setContent(gridArray);
		screen.printContent();
	}

}
