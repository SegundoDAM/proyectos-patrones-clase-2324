package ejercicio03.factory;
import ejercicio03.product.Car;
import ejercicio03.product.CarType;
import ejercicio03.product.Location;

public class CarFactory
{
	private CarFactory() {
		//Prevent instantiation
	}

	public static Car buildCar(CarType type,Location location)
	{
		Car car = null;
//		Location location = Location.ASIA; 
		//Read location property somewhere from configuration
		//Use location specific car factory
		switch(location)
		{
			case USA:
			car = USACarFactory.buildCar(type);
			break;
			//Llamamos al método estatico con el mismo nombre
			case ASIA:
			car = AsiaCarFactory.buildCar(type);
			break;
			default:
			car = DefaultCarFactory.buildCar(type);
		}
	return car;
	}
}