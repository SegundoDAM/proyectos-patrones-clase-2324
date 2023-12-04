package teoriabienparametrizada05;

public class ConcreteProductA extends Product {

	public int mipropiedad;

	//constructor no accesible
	private ConcreteProductA() {
		super();
	}
	public ConcreteProductA(int mipropiedad) {
		this();
		this.mipropiedad = mipropiedad;
	}
	@Override
	public void operacion() {
		// TODO Auto-generated method stub
		System.out.println("operacion del producto " + this.getClass().getName());
	}

	//metodo para crear el producto
	public static Product getProduct(int valor) {
		return new ConcreteProductA(valor);
	}

	public int getMipropiedad() {
		return mipropiedad;
	}

	public void setMipropiedad(int mipropiedad) {
		this.mipropiedad = mipropiedad;
	}



	
}