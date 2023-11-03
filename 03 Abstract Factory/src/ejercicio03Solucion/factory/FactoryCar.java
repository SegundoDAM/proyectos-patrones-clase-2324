package ejercicio03Solucion.factory;

import ejercicio03Solucion.product.Car;
import ejercicio03Solucion.product.Location;

public abstract class FactoryCar {
	public abstract Car factoryMethod(Location location);
}
