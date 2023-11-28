import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testtontuna {

	@Test
	void test() {
		Papito persona=new Papito();
		assertFalse(persona instanceof HijitoBueno);
		persona.convierte();
		assertTrue(persona instanceof HijitoBueno);
	}

}
