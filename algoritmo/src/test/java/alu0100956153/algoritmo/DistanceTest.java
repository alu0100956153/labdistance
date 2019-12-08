package alu0100956153.algoritmo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistanceTest {

	@Test
	public void testMnmkin() {
		
	}
	@Test
	public void testMinequal() {
		int a = Distance.minimum(0,0,0);
		assertEquals(a,0);
	}
	@Test
	public void testDistance1() {
		int a =Distance.computeLevenshteinDistance("qui","que");
		assertEquals(a,1);
	}
	
	public void testDistancenull() {
		int a =Distance.computeLevenshteinDistance("","");
		assertEquals(a,0);
	}
	public void testDistance() {
		int a =Distance.computeLevenshteinDistance("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum","");
		assertEquals(a,1);
	}


}
