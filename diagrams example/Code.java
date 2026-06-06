import static org.junit.Assert.*;

import org.junit.Test;

public class SolveLinearTest {

	@Test
	public void testValidSolution() {
		float[] answer = new float[]{-1, -1};
		assertEquals(answer, SolveLinear(3, 2, 2, 1));
	}
	
	@Test
	public void testNoSolution() {
		assertEquals(null, SolveLinear(3, 1, 3, 2));
	}

	@Test
	public void testZeroSlope() {
		float[] answer = new float[]{0, 0};
		assertEquals(answer, SolveLinear(0, 1, 0, 1));
	}

}
