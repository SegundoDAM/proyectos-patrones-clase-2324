package ejercicio04.factory;

import ejercicio04.product.Car;
import ejercicio04.product.Location;

public abstract class FactoryCar {
	public abstract Car factoryMethod(Location location);
}
