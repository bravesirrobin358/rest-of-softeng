import static org.junit.Assert.*;

import org.junit.Test;

public class StardAndIdleTest {
	
	Context context = new Context();
	State currentState = Start.instance();

	@Test
	public void testToString() {
		assertEquals(currentState.toString(), "\nCurrent state: Start");
	}
	
	@Test
	public void testDoAction() {
		currentState.doAction(context);
		currentState = context.getState();
		assertEquals(currentState.toString(), "\nCurrent state: Idle");
	}
	
	@Test
	public void testInstance() {
		currentState.doAction(context);
		currentState = context.getState();
		assertEquals(Idle.instance(), context.getState());
	}



}
