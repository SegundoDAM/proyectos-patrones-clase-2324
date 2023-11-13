package ejemploPersonaje;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClientTest {

	@Test
	void test() {
		Personaje personaje=new Aldeano();
		System.out.println(personaje.mostrarArmadura());
		personaje=new Armadura(personaje);
		System.out.println(personaje.mostrarArmadura());
		personaje=new Armadura(personaje);
		System.out.println(personaje.mostrarArmadura());
		personaje=new Armadura(personaje);
		System.out.println(personaje.mostrarArmadura());
		personaje=new Armadura(personaje);
		System.out.println(personaje.mostrarArmadura());
		personaje=personaje.decrementaElemento();
		System.out.println(personaje.mostrarArmadura());
	}

}
