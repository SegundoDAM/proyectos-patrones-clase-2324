package model.data;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class seresTest {

	@Test
	void test() {
		Ser ser=new Ser(100);
		ser.setEsperanzaVida(80);
		assertTrue(ser.isMenor());
		for (int i = 0; i < 19; i++) {
			ser.envejecer();
		}
		assertTrue(ser.isAdulto());
		for (int i = 18; i < 66; i++) {
			ser.envejecer();
		}
		assertTrue(ser.isAnciano());
	}

}
