package ejercicio03.factory;
import ejercicio03.product.Car;
import ejercicio03.product.CarType;
import ejercicio03.product.Location;
import ejercicio03.product.LuxuryCar;
import ejercicio03.product.SedanCar;
import ejercicio03.product.SmallCar;

public class AsiaCarFactory
{
	public static Car buildCar(CarType model)
	{
		//Ahora podemos crear el producto concreto pasando por parametros los
		//valores de construccion del objeto que necesitemos
		Car car = null;
		switch (model)
		{
			case SMALL:
			car = new SmallCar(Location.ASIA);
			break;

			case SEDAN:
			car = new SedanCar(Location.ASIA);
			break;

			case LUXURY:
			car = new LuxuryCar(Location.ASIA);
			break;

			default:
			//throw some exception
			break;
		}
		return car;
	}
}
