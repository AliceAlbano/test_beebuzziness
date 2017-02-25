package lcd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LCDScreenTest {
	
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
	private Grid emptyGrid;
	
	private LCDScreen screen;

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
		emptyGrid = new Grid(Symbol.EMPTY);
		
		screen = new LCDScreen();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetLCDScreen10Numbers() {
		screen.setLCDScreen(new Grid[] {grid0, grid1, grid2, grid3,
							grid4, grid5, grid6, grid7, grid8, grid9});
		
		assertArrayEquals(screen.getLCDScreen(), new Grid[] {
							grid0, grid1, grid2, grid3,grid4, 
							grid5, grid6, grid7, grid8, grid9});
	
		screen.setLCDScreen(new Grid[] {grid1, grid1, grid2, grid2,
				grid3, grid3, grid4, grid4, grid5, grid5});

		assertArrayEquals(screen.getLCDScreen(), new Grid[] {
			grid1, grid1, grid2, grid2, grid3,
			grid3, grid4, grid4, grid5, grid5});
	}
	
	@Test
	public void testSetLCDScreen3Numbers() {
		screen.setLCDScreen(new Grid[] {grid9, grid1, grid0});
		
		assertArrayEquals(screen.getLCDScreen(), new Grid[] {
			emptyGrid, emptyGrid, emptyGrid, emptyGrid, emptyGrid,
			emptyGrid, emptyGrid, grid9, grid1, grid0 });
	}
	
	@Test
	public void testSetLCDScreen1Number() {
		screen.setLCDScreen(new Grid[] {grid9});
		
		assertArrayEquals(screen.getLCDScreen(), new Grid[] {
			emptyGrid, emptyGrid, emptyGrid, emptyGrid, emptyGrid,
			emptyGrid, emptyGrid, emptyGrid, emptyGrid, grid9});
	}
	
	@Test
	public void testSetLCDScreenEmpty() {
		screen.setLCDScreen(new Grid[] {});
		
		assertArrayEquals(screen.getLCDScreen(), new Grid[] {
			emptyGrid, emptyGrid, emptyGrid, emptyGrid, emptyGrid,
			emptyGrid, emptyGrid, emptyGrid, emptyGrid, emptyGrid});
	}

}
