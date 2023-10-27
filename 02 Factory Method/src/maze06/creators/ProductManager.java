package maze06.creators;

import java.util.List;
import java.util.Random;

import maze06.products.Door;
import maze06.products.Side;
import maze06.products.Wall;
import maze06.products.Window;

public class ProductManager {
	public static Side getProduct(CreatorAbstract creator) {
		return creator.factoryMethod();
	}

	public static Side getRandomProductNoDoor() {
		List<Side> lista = List.of(new Wall(),new Window());
		return lista.get(new Random().nextInt(lista.size()));
	}
}
