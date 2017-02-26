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
	
	// A helper to compare two arrays of arrays
	private void compareGridArrays(Grid[] array1, Grid[] array2){
		int i;
		for(i = 0; i < array1.length; i++) {
			assertArrayEquals(array1[i].getGridFirstLine(), array2[i].getGridFirstLine());
			assertArrayEquals(array1[i].getGridSecondLine(), array2[i].getGridSecondLine());
			assertArrayEquals(array1[i].getGridThirdLine(), array2[i].getGridThirdLine());
		}
	}

	@Test
	public void testSetLCDScreen10Numbers() {
		screen.setLCDScreen(new Grid[] {grid0, grid1, grid2, grid3,
							grid4, grid5, grid6, grid7, grid8, grid9});
		
		Grid[] gridArray = new Grid[] {
							grid0, grid1, grid2, grid3,grid4, 
							grid5, grid6, grid7, grid8, grid9};
		compareGridArrays(gridArray, screen.getLCDScreen());
	
		screen.setLCDScreen(new Grid[] {grid1, grid1, grid2, grid2,
				grid3, grid3, grid4, grid4, grid5, grid5});

		Grid[] gridArray2 = new Grid[] {
			grid1, grid1, grid2, grid2, grid3,
			grid3, grid4, grid4, grid5, grid5};
		
		compareGridArrays(gridArray2, screen.getLCDScreen());
	}
	
	@Test
	public void testSetLCDScreen3Numbers() {
		screen.setLCDScreen(new Grid[] {grid9, grid1, grid0});
		Grid[] gridArray = new Grid[] {emptyGrid, emptyGrid, emptyGrid, emptyGrid, emptyGrid,
				emptyGrid, emptyGrid, grid9, grid1, grid0 };
		
		compareGridArrays(gridArray, screen.getLCDScreen());		
	}
	
	@Test
	public void testSetLCDScreen1Number() {
		screen.setLCDScreen(new Grid[] {grid9});
		Grid[] gridArray = new Grid[] {emptyGrid, emptyGrid, emptyGrid, emptyGrid, emptyGrid,
				emptyGrid, emptyGrid, emptyGrid, emptyGrid, grid9 };
		
		compareGridArrays(gridArray, screen.getLCDScreen());	
	}
	
	@Test
	public void testSetLCDScreenEmpty() {
		screen.setLCDScreen(new Grid[] {});
		Grid[] gridArray = new Grid[] {emptyGrid, emptyGrid, emptyGrid, emptyGrid, emptyGrid,
				emptyGrid, emptyGrid, emptyGrid, emptyGrid, emptyGrid};
		
		compareGridArrays(gridArray, screen.getLCDScreen());	
	}

}
