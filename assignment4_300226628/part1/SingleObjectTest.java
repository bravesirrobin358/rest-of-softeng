import static org.junit.Assert.*;

import org.junit.Test;

public class SingleObjectTest {
	SingleObject object = SingleObject.getInstance();

	@Test
	public void testGetInstance() {
		assertNotNull(object);
	}

	@Test
	public void testShowMessage() {
		try {
			object.showMessage();
			assertTrue(true);
		} catch(Exception e) {
			fail("exception detected");
		}
	}

}
