import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeFactoryTest {
	
	ShapeFactory shapeFactory = new ShapeFactory();
	Shape currentShape;
	
	@Test
	public void testExists() {
		assertNotSame(shapeFactory, null);
	}
	@Test
	public void testGetShapeNull() {
		currentShape = null;
		assertSame(currentShape, shapeFactory.getShape("anything else"));
	}
	
	
	@Test
	public void testGetShapeCircle() {
		currentShape = new Circle();
		assertSame(currentShape.getClass().getName(), shapeFactory.getShape("CIRCLE").getClass().getName());
		
	}
	
	
}
