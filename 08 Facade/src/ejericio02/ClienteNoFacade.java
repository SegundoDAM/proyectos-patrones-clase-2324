package ejericio02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteNoFacade {

	@Test
	void test() {
		A a = new A();
		new Accesor().grabarA(a);
	}
}