package lcd;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			SymbolString symbolString = new SymbolString(args[0]);
			
			ControllerLCD controller = new ControllerLCD();
			
			controller.printSymbolString(symbolString);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Usage : give a number as argument.");
		}

	}

}
