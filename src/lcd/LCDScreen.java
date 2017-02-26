package lcd;

// We assume that our screen can print 10 numbers (width = 10)
public class LCDScreen extends Screen {
	
	private int width = 10;
	
	private Grid[] screen = new Grid[width];
	
	
// This method will be called by the ControllerLCD, which already 
// checks if the length of the array grid is <= width
// Therefore we do not handle this case in this method
	public void setLCDScreen(Grid[] gridArray) {
		int lengthGridArray = gridArray.length;
		int i = 0;
		
		// If we don't want to print 10 characters, we add empty grids to the screen
		// It will allow to print to the right of the screen
		if (lengthGridArray < 10) {
			int diff = 10 - lengthGridArray;
			Grid emptyGrid = new Grid(Symbol.EMPTY);
			
			while (diff > 0) {
				this.screen[i] = emptyGrid; 
				diff --;
				i ++;
			}
		}	
		
		// We add the grids given in parameter to our screen (on the right)
		int j;
		for (j = 0; j < lengthGridArray; j ++) {
			this.screen[i] = gridArray[j];
			i ++;	
		}
	}
	
	public Grid[] getLCDScreen() {
		return this.screen;
	}
	
	// All the print methods here are not tested : as they are void-returning
	// functions, unit testing is not possible unless we change the architecture
	// of our class
	// If we want to test this part, we need to do black-box testing : for instance
	// a script who will call our main class with a parameter, reads its standard 
	// output and compares it with the expected results
	// For time reason, we do not make the script for now, as all other methods 
	// have unit testing
	private void printGridLineOnLCDScreen(Code[] gridLine) {
		int i;
		for (i = 0; i < gridLine.length; i ++) {
			System.out.print(gridLine[i].getValue());
		}
		System.out.print(" ");
	}
	
	private void printFirstLineOnLCDScreen() {
		int i;
		for (i = 0; i < this.screen.length; i++) {
			printGridLineOnLCDScreen(screen[i].getGridFirstLine());
		}
		System.out.println();
	}
	
	private void printSecondLineOnLCDScreen() {
		int i;
		for (i = 0; i < this.screen.length; i++) {
			printGridLineOnLCDScreen(screen[i].getGridSecondLine());
		}
		System.out.println();
	}
	
	private void printThirdLineOnLCDScreen() {
		int i;
		for (i = 0; i < this.screen.length; i++) {
			printGridLineOnLCDScreen(screen[i].getGridThirdLine());
		}
		System.out.println();
	}
	
	public void printLCDScreen() {
		printFirstLineOnLCDScreen();
		printSecondLineOnLCDScreen();
		printThirdLineOnLCDScreen();
		
	}
}
