import org.junit.Test;
import static org.junit.Assert.*;
/** A JUnit test class to test the class IMath. */
public class IMathTest {
	int x = 1;
	int y = 2;
	boolean guard = true;
	boolean notGuard = false;
/** Test isqrt. */
 @Test
public void testIsqrt() {
	//assertEquals(0, IMath.isqrt(0)); // line 13
	assertEquals(1, IMath.isqrt(1));
	assertEquals(2, IMath.isqrt(2));
	/*assertEquals(1, IMath.isqrt(3));
	assertEquals(2, IMath.isqrt(4));
	assertEquals(2, IMath.isqrt(7));
	assertEquals(3, IMath.isqrt(9));
	assertEquals(10, IMath.isqrt(100));*/
}
}
