package teoriabienparametrizada05;

public class ConcreteCreatorA implements Creator {

	public int mipropiedad;
	

	public ConcreteCreatorA(int valor) {
		super();
		this.mipropiedad = valor;
	}

	
	// dejar el factory method sin add parametros
	public Product factoryMethod() {
		return ConcreteProductA.getProduct(mipropiedad);

	}
	
	
}