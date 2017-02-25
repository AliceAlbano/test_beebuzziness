package lcd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GridTest {
	
	private Grid grid0;
	private Grid grid1;
	private Grid grid2;
	private Grid grid3;
	private Grid grid4;
	private Grid grid5;
	private Grid grid6;
	private Grid grid7;
	private Grid grid8;
	private Grid grid9;

	@Before
	public void setUp() throws Exception {
		grid0 = new Grid(Symbol.ZERO);
		grid1 = new Grid(Symbol.ONE);
		grid2 = new Grid(Symbol.TWO);
		grid3 = new Grid(Symbol.THREE);
		grid4 = new Grid(Symbol.FOUR);
		grid5 = new Grid(Symbol.FIVE);
		grid6 = new Grid(Symbol.SIX);
		grid7 = new Grid(Symbol.SEVEN);
		grid8 = new Grid(Symbol.EIGHT);
		grid9 = new Grid(Symbol.NINE);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetGridFirstLine() {
		Code[] line = new Code[3];
		line = grid0.getGridFirstLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.UNDERSCORE, Code.SPACE}, line);
		
		line = grid1.getGridFirstLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.SPACE, Code.SPACE}, line);
		
		line = grid2.getGridFirstLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.UNDERSCORE, Code.SPACE}, line);
		
		line = grid3.getGridFirstLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.UNDERSCORE, Code.SPACE}, line);
		
		line = grid4.getGridFirstLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.SPACE, Code.SPACE}, line);
		
		line = grid5.getGridFirstLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.UNDERSCORE, Code.SPACE}, line);
		
		line = grid6.getGridFirstLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.UNDERSCORE, Code.SPACE}, line);
		
		line = grid7.getGridFirstLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.UNDERSCORE, Code.SPACE}, line);
		
		line = grid8.getGridFirstLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.UNDERSCORE, Code.SPACE}, line);
		
		line = grid9.getGridFirstLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.UNDERSCORE, Code.SPACE}, line);
		 
		
	}

	@Test
	public void testGetGridSecondLine() {
		Code[] line = new Code[3];
		line = grid0.getGridSecondLine();
		assertArrayEquals(new Code[] {Code.PIPE, Code.SPACE, Code.PIPE}, line);
		
		line = grid1.getGridSecondLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.SPACE, Code.PIPE}, line);
		
		line = grid2.getGridSecondLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.UNDERSCORE, Code.PIPE}, line);
		
		line = grid3.getGridSecondLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.UNDERSCORE, Code.PIPE}, line);
		
		line = grid4.getGridSecondLine();
		assertArrayEquals(new Code[] {Code.PIPE, Code.UNDERSCORE, Code.PIPE}, line);
		
		line = grid5.getGridSecondLine();
		assertArrayEquals(new Code[] {Code.PIPE, Code.UNDERSCORE, Code.SPACE}, line);
		
		line = grid6.getGridSecondLine();
		assertArrayEquals(new Code[] {Code.PIPE, Code.UNDERSCORE, Code.SPACE}, line);
		
		line = grid7.getGridSecondLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.SPACE, Code.PIPE}, line);
		
		line = grid8.getGridSecondLine();
		assertArrayEquals(new Code[] {Code.PIPE, Code.UNDERSCORE, Code.PIPE}, line);
		
		line = grid9.getGridSecondLine();
		assertArrayEquals(new Code[] {Code.PIPE, Code.UNDERSCORE, Code.PIPE}, line);
	}

	@Test
	public void testGetGridThirdLine() {
		Code[] line = new Code[3];
		line = grid0.getGridThirdLine();
		assertArrayEquals(new Code[] {Code.PIPE, Code.UNDERSCORE, Code.PIPE}, line);
		
		line = grid1.getGridThirdLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.SPACE, Code.PIPE}, line);
		
		line = grid2.getGridThirdLine();
		assertArrayEquals(new Code[] {Code.PIPE, Code.UNDERSCORE, Code.SPACE}, line);
		
		line = grid3.getGridThirdLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.UNDERSCORE, Code.PIPE}, line);
		
		line = grid4.getGridThirdLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.SPACE, Code.PIPE}, line);
		
		line = grid5.getGridThirdLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.UNDERSCORE, Code.PIPE}, line);
		
		line = grid6.getGridThirdLine();
		assertArrayEquals(new Code[] {Code.PIPE, Code.UNDERSCORE, Code.PIPE}, line);
		
		line = grid7.getGridThirdLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.SPACE, Code.PIPE}, line);
		
		line = grid8.getGridThirdLine();
		assertArrayEquals(new Code[] {Code.PIPE, Code.UNDERSCORE, Code.PIPE}, line);
		
		line = grid9.getGridThirdLine();
		assertArrayEquals(new Code[] {Code.SPACE, Code.SPACE, Code.PIPE}, line);
	}

}
