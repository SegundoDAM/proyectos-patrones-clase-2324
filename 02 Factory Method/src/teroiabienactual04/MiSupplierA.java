package teroiabienactual04;

import java.util.function.Supplier;

public class MiSupplierA implements Supplier<Product> {

	@Override
	public Product get() {
		return new ConcreteProductA();
	}

}
