package lcd;


public class ControllerLCD {

	private Grid[] gridArray;
	private LCDScreen screen;
	
	public ControllerLCD() {
		this.screen = new LCDScreen();
	}
	
	// If we want to test this method, we need to use black-box testing, as it is a
	// void-returning function.
	public void printSymbolString(SymbolString symbolString) {
		
		int lengthString = symbolString.getSymbolString().length;
		
		int lengthGridArray = Math.min(lengthString, screen.getWidth());
		gridArray = new Grid[lengthGridArray];
		
		int i;
		
		// If the string to print is too long for the screen, we only print the
		// same number of characters as the width of the screen
		// If an other behavior is required, we should raise an exception
		for (i = 0; ((i < lengthString) && (i < screen.getWidth())) ; i ++) {
			gridArray[i] = new Grid(symbolString.getSymbolString()[i]);
		}
		
		screen.setLCDScreen(gridArray);

		screen.printLCDScreen();
	}

}
