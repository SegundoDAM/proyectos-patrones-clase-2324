package ejercicio02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContratoTest {

	@Test
	void test() throws CloneNotSupportedException {
		Persona persona = new Persona(10, "Jimeno");
		Contrato contrato=new Contrato(1, "jose luis", persona);
		Contrato clone = contrato.clone();
	}

}
