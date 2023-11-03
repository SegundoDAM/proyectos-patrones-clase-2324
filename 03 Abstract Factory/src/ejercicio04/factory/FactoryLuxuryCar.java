package ejercicio04.factory;


import ejercicio04.product.Car;
import ejercicio04.product.Location;
import ejercicio04.product.LuxuryCar;

public class FactoryLuxuryCar extends FactoryCar {

	@Override
	public Car factoryMethod(Location location) {
		return new LuxuryCar(location);
	}

}
