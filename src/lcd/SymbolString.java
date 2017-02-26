package lcd;


public class SymbolString {

	private Symbol[] symbolString;
	
	public SymbolString(String string) {
		symbolString = new Symbol[string.length()];

	    for (int x = 0; x < string.length(); x++) {
	    	symbolString[x] = charToSymbol(string.charAt(x));
	    }
	
	}
	
	private Symbol charToSymbol(char c) {
		switch (c) {
			case '0':	return Symbol.ZERO;
			case '1':	return Symbol.ONE;
			case '2':	return Symbol.TWO;
			case '3':	return Symbol.THREE;
			case '4':	return Symbol.FOUR;
			case '5':	return Symbol.FIVE;
			case '6':	return Symbol.SIX;
			case '7':	return Symbol.SEVEN;
			case '8':	return Symbol.EIGHT;
			case '9':	return Symbol.NINE;
			default:	throw new IllegalArgumentException();
		}
	}
	
	public Symbol[] getSymbolString() {
		return this.symbolString;
	}

}
