package vampire;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

public class VampireNumberTest {

	@Test
	public void testNonEvenDigit() {
		int[] fangs = VampireNumber.getFangs(126);
		assertEquals(fangs, null);
	}

	@Test
	public void testNonVampireNumber() {
		int[] fangs = VampireNumber.getFangs(53411232);
		assertEquals(fangs, null);
	}

	@Test
	public void test1260() { // 21, 60
		int[] fangs = VampireNumber.getFangs(1260);
		Arrays.sort(fangs);
		assertEquals(fangs[0], 21);
		assertEquals(fangs[1], 60);
	}

	@Test
	public void test11930170() { // 1301, 9170
		int[] fangs = VampireNumber.getFangs(11930170);
		Arrays.sort(fangs);
		assertEquals(fangs[0], 1301);
		assertEquals(fangs[1], 9170);
	}

	@Test
	public void test12054060() { // 2004, 6015
		int[] fangs = VampireNumber.getFangs(12054060);
		Arrays.sort(fangs);
		assertEquals(fangs[0], 2004);
		assertEquals(fangs[1], 6015);
	}
}
