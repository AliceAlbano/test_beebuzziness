package lcd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SymbolStringTest {
	
	private SymbolString zero;
	private SymbolString one;
	private SymbolString two;
	private SymbolString three;
	private SymbolString four;
	private SymbolString five;
	private SymbolString six;
	private SymbolString seven;
	private SymbolString eight;
	private SymbolString nine;
	
	private SymbolString symbolStringTest;

	@Before
	public void setUp() throws Exception {
		
		zero = new SymbolString("0");
		one = new SymbolString("1");
		two = new SymbolString("2");
		three = new SymbolString("3");
		four = new SymbolString("4");
		five = new SymbolString("5");
		six = new SymbolString("6");
		seven = new SymbolString("7");
		eight = new SymbolString("8");
		nine = new SymbolString("9");
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSingleSymbol() {
		Symbol[] symbolString = {Symbol.ZERO};
		assertArrayEquals(symbolString, zero.getSymbolString());
		
		symbolString[0] = Symbol.ONE;
		assertArrayEquals(symbolString, one.getSymbolString());
		
		symbolString[0] = Symbol.TWO;
		assertArrayEquals(symbolString, two.getSymbolString());
		
		symbolString[0] = Symbol.THREE;
		assertArrayEquals(symbolString, three.getSymbolString());
		
		symbolString[0] = Symbol.FOUR;
		assertArrayEquals(symbolString, four.getSymbolString());
		
		symbolString[0] = Symbol.FIVE;
		assertArrayEquals(symbolString, five.getSymbolString());
		
		symbolString[0] = Symbol.SIX;
		assertArrayEquals(symbolString, six.getSymbolString());
		
		symbolString[0] = Symbol.SEVEN;
		assertArrayEquals(symbolString, seven.getSymbolString());
		
		symbolString[0] = Symbol.EIGHT;
		assertArrayEquals(symbolString, eight.getSymbolString());
		
		symbolString[0] = Symbol.NINE;
		assertArrayEquals(symbolString, nine.getSymbolString());
	}
	
	@Test
	public void testThreeSymbols() {
		symbolStringTest = new SymbolString("910");
		Symbol[] symbolString = {Symbol.NINE, Symbol.ONE, Symbol.ZERO};
		assertArrayEquals(symbolString, symbolStringTest.getSymbolString());
	}
	
	@Test
	public void testTenSymbols() {
		symbolStringTest = new SymbolString("0123456789");
		Symbol[] symbolString = {Symbol.ZERO, Symbol.ONE, Symbol.TWO, Symbol.THREE, Symbol.FOUR,
				Symbol.FIVE, Symbol.SIX, Symbol.SEVEN, Symbol.EIGHT, Symbol.NINE};
		assertArrayEquals(symbolString, symbolStringTest.getSymbolString());
	}

	@Test
	public void testTwelveSymbols() {
		symbolStringTest = new SymbolString("012345678910");
		Symbol[] symbolString = {Symbol.ZERO, Symbol.ONE, Symbol.TWO, Symbol.THREE, Symbol.FOUR,
				Symbol.FIVE, Symbol.SIX, Symbol.SEVEN, Symbol.EIGHT, Symbol.NINE, Symbol.ONE, Symbol.ZERO};
		assertArrayEquals(symbolString, symbolStringTest.getSymbolString());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIllegalArgumentExcepption() {
		symbolStringTest = new SymbolString("a");
	}
	
}
