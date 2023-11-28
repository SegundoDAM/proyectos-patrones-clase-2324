package model.data;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class seresTest {

	@Test
	void test() {
		Ser ser=new Menor(100);
		ser.setEsperanzaVida(80);
		assertTrue(ser.isMenor());
		for (int i = 0; i < 19; i++) {
			ser.envejecer();
		}
		ser=new Adulto(ser);
		assertTrue(ser instanceof Adulto);
		for (int i = 18; i < 66; i++) {
			ser.envejecer();
		}
		ser=new Ser(ser);
		assertTrue(ser instanceof Ser);
	}

}
