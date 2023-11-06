package porrazo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
		Persona build = Persona.builder()
				.id(1)
				.nombre("Luis")
				.apellidos("Pi y Pi")
				.color("rojo")
				.build();
	}

}
