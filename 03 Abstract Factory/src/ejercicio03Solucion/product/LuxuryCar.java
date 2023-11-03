package ejercicio03Solucion.product;

public class LuxuryCar extends Car
{
	public LuxuryCar(Location location)
	{
		super(location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building luxury car");
	}
}