package ejercicio04.factory;

import ejercicio04.product.Bike;
import ejercicio04.product.Car;

public abstract class FactoryAbstractLocation {
	public abstract Car createCar(FactoryCar factoryCar);
	public abstract Bike createBike(FactoryBike factoryBike);
}
