package ejercicio03.test;

import ejercicio03.factory.CarFactory;
import ejercicio03.product.Car;
import ejercicio03.product.CarType;
import ejercicio03.product.Location;

public class TestFactoryPattern
{
	public static void main(String[] args)
	{
		//Creamos el Producto diciendo que queremos un coche de tipo SMALL
		System.out.println(CarFactory.buildCar(CarType.SMALL,Location.ASIA));
		System.out.println(CarFactory.buildCar(CarType.SEDAN,Location.USA));
		System.out.println(CarFactory.buildCar(CarType.LUXURY,Location.USA));
		
		
		Car Micoche=CarFactory.buildCar(CarType.SEDAN, Location.USA);
		System.out.println(Micoche.getLocation());
		System.out.println(Micoche.getClass());
		
	}
}
/*
Output: (Default location is Asia)

Building small car
Model- SMALL built in ASIA
Building sedan car
Model- SEDAN built in ASIA
Building luxury car
Model- LUXURY built in ASIA
*/