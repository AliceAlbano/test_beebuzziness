package lcd;


public class ControllerLCD {
	
	private SymbolString symbolString;
	private LCDScreen screen;
	
	public ControllerLCD() {
		this.screen = new LCDScreen();
	}
	
	public void printSymbolString(SymbolString symbolString) {

		//call getSymbolString 
		
		//call Grid on each symbol and call setLCDScreen 
		//call printScreen
	}
	
	private Grid[] computeResult() {
		//call encoder
		return null;
	}
	
	private void printResult() {
		//call printScreen
	}
}
