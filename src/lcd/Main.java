package lcd;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Screen screen = new LCDScreen();
		
		SymbolString symbolString;
		try {
			symbolString = new SymbolString(args[0]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Usage : give a number as argument.");
			return;
		}
		catch (IllegalArgumentException e) {
			System.err.println("Usage : give a number as argument.");
			return;
		}
		ScreenController controller = new ScreenController(screen);
		
		controller.printSymbolString(symbolString);

	}

}
