import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeMakerTest {
	
	ShapeMaker shapeMaker = new ShapeMaker();

	@Test
	public void testDrawRectangle() {
		assertEquals("Rectangle::draw()", shapeMaker.rectangl);
	}

	@Test
	public void testDrawCircle() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawSquare() {
		fail("Not yet implemented");
	}

}
