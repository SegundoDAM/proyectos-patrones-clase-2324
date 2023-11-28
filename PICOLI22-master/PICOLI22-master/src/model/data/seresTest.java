package model.data;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class seresTest {

	@Test
	void test() {
		LinkedList<Ser> seres=new LinkedList();
		Ser juanito=new Menor(100);
		Ser menor=juanito;
		seres.add(juanito);
		juanito.setEsperanzaVida(80);
		assertTrue(juanito.isMenor());
		for (int i = 0; i < 19; i++) {
			juanito.envejecer();
		}
		juanito=new Adulto(juanito);
		Ser adulto=juanito;
		assertTrue(juanito instanceof Adulto);
		for (int i = 18; i < 66; i++) {
			juanito.envejecer();
		}
		juanito=new Ser(juanito);
		//muere
		assertTrue(juanito.equals(adulto));
		assertTrue(seres.remove(juanito));
		assertEquals(0, seres.size());
		assertTrue(juanito instanceof Ser);
//		assertTrue(menor==ser);
//		assertTrue(adulto==ser);
	}

}
