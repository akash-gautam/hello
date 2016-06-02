package mr.app.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testReverse() {
		assertEquals("TSET", App.reverse("TEST"));
	}

}
