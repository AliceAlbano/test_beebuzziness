package lcd;


public class SymbolString {

	private Symbol[] symbolstring;
	
	public SymbolString(String symbolString) {
		symbolstring = new Symbol[symbolString.length()];

	    for (int x = 0; x < symbolString.length(); x++) {
	    	
	    	switch (symbolString.charAt(x)) {
	    		case '0':	symbolstring[x] = Symbol.ZERO;
	    					break;
	    		case '1':	symbolstring[x] = Symbol.ONE;
							break;
	    		case '2':	symbolstring[x] = Symbol.TWO;
							break;
	    		case '3':	symbolstring[x] = Symbol.THREE;
							break;
	    		case '4':	symbolstring[x] = Symbol.FOUR;
							break;
	    		case '5':	symbolstring[x] = Symbol.FIVE;
							break;
	    		case '6':	symbolstring[x] = Symbol.SIX;
							break;
	    		case '7':	symbolstring[x] = Symbol.SEVEN;
							break;
	    		case '8':	symbolstring[x] = Symbol.EIGHT;
							break;
	    		case '9':	symbolstring[x] = Symbol.NINE;
							break;
				default:	throw new IllegalArgumentException();
	    	}
	    }
	
	}
	
	public Symbol[] getSymbolString() {
		return this.symbolstring;
	}

}
