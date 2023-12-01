package model.data;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class seresTest {

	@Test
	void test() {
		Ser juanito=new Ser(100);
		juanito.setEsperanzaVida(80);
		assertTrue(juanito.getEtapaVital() instanceof Menor);
		for (int i = 0; i < 19; i++) {
			juanito.envejecer();
			juanito.alimentar(1);
		}
		juanito.alimentar(1);
		assertTrue(juanito.getEtapaVital() instanceof Adulto);
		for (int i = 18; i < 66; i++) {
			juanito.alimentar(1);
			juanito.envejecer();
		}
		assertFalse(juanito.getEtapaVital() instanceof Adulto);
		assertFalse(juanito.getEtapaVital() instanceof Menor);
	}

}
