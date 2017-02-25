package lcd;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SymbolString symbolString = new SymbolString("910");
		
		ControllerLCD controller = new ControllerLCD();
		
		controller.printSymbolString(symbolString);
	}

}
