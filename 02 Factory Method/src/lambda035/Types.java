package lambda035;

import java.util.function.Supplier;

public enum Types {
	
	A(()->{return new ConcreteProduct();}),
	B(()->{return new ConcreteProduct2();});

	private Supplier<Product> supplier;
	
	private Types(Supplier<Product> supplier) {
		this.supplier = supplier;
	}

	public Product factoryMethod() {
		return supplier.get();
	}
	
}
