package ejercicio03Solucion.factory;


import ejercicio03Solucion.product.Car;
import ejercicio03Solucion.product.Location;
import ejercicio03Solucion.product.LuxuryCar;

public class FactoryLuxuryCar extends FactoryCar {

	@Override
	public Car factoryMethod(Location location) {
		return new LuxuryCar(location);
	}

}
