package ejercicio03.factory;
import ejercicio03.product.Car;
import ejercicio03.product.CarType;
import ejercicio03.product.Location;
import ejercicio03.product.LuxuryCar;
import ejercicio03.product.SedanCar;
import ejercicio03.product.SmallCar;

public class DefaultCarFactory
{
	public static Car buildCar(CarType model)
	{
		Car car = null;
		switch (model)
		{
			case SMALL:
			car = new SmallCar(Location.DEFAULT);
			break;

			case SEDAN:
			car = new SedanCar(Location.DEFAULT);
			break;

			case LUXURY:
			car = new LuxuryCar(Location.DEFAULT);
			break;

			default:
			//throw some exception
			break;
		}
		return car;
	}
}