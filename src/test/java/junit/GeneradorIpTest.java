package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class GeneradorIpTest {
	GeneradorIp ip;
	@BeforeEach
	void setUp() throws Exception {
		ip = new GeneradorIp();
	}

	@RepeatedTest(1000)
	void testGenerarNumero() {
        int target = ip.generarNumero(0, 254);
        assertTrue( target >= 0 && target <= 254);
	}
	@Test
	void testGenerarIp() {
		String[] target = ip.generarIp().split("\\.");
		String expected = "0";
		assertNotEquals(target[0], expected);
		assertNotEquals(target[3], expected);
	}
}
