package ejercicio04.test;
import ejercicio04.factory.FactoryBike;
import ejercicio04.factory.FactoryLuxuryCar;
import ejercicio04.factory.FactoryUSA;
import ejercicio04.product.Bike;
import ejercicio04.product.Car;
import ejercicio04.product.Location;
import ejercicio04.product.LuxuryCar;

public class TestFactoryPattern
{
	public static void main(String[] args)
	{
		//Creamos el Producto diciendo que queremos un coche de tipo SMALL
		System.out.println(new LuxuryCar(Location.USA));
		
		Car Micoche=new FactoryUSA().createCar(new FactoryLuxuryCar());
		Bike bike=new FactoryUSA().createBike(FactoryBike.COUNTRY);
		System.out.println(Micoche.getLocation());
		System.out.println(Micoche.getClass());
		System.out.println(bike.getLocation());
		System.out.println(bike.getClass());
		
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