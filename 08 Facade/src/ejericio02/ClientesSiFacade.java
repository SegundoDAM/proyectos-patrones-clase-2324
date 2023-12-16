package ejericio02;

import org.junit.jupiter.api.Test;

class ClientesSiFacade {

	@Test
	void test() {
		A a=new A();
		new Facade().grabar(a);
	}

}
