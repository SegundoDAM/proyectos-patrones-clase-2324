package lambda035;

public class ProductManager {
	
	public Product getProduct(Types type) {
		return type.factoryMethod();
	}
}
