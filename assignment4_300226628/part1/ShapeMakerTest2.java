import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeMakerTest2 {

	ShapeMaker shapeMaker = new ShapeMaker();
	
	@Test
	public void testShapeMaker() {
		assertNotNull(shapeMaker);
	}

	@Test
	public void testDrawRectangle() {
		try {
			shapeMaker.drawRectangle();
			assertTrue(true);
		} catch(Exception e) {
			fail("exception detected");
		}
	}

	@Test
	public void testDrawCircle() {
		try {
			shapeMaker.drawCircle();
			assertTrue(true);
		} catch(Exception e) {
			fail("exception detected");
		}
	}

}
