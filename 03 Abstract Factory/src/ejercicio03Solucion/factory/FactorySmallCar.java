package ejercicio03Solucion.factory;

import ejercicio03Solucion.product.Car;
import ejercicio03Solucion.product.Location;
import ejercicio03Solucion.product.SmallCar;

public class FactorySmallCar extends FactoryCar {

	@Override
	public Car factoryMethod(Location location) {
		return new SmallCar(location);
	}

}
