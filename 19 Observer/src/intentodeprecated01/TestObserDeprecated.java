package intentodeprecated01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Observer;

import org.junit.jupiter.api.Test;

class TestObserDeprecated {

	@Test
	void test() {
		Observer observer=new Consumer();
		Proveedor proveedor=new Proveedor(observer);
		proveedor.setArg("pena");
	}

}
