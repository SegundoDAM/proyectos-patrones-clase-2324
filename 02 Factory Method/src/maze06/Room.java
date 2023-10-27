package maze06;

import java.util.HashMap;
import java.util.Map;

import maze06.creators.DoorCreator;
import maze06.creators.ProductManager;
import maze06.products.Door;
import maze06.products.Side;

public class Room {
	private final int size = 4;
	private HashMap<Polar, Side> sides = new HashMap<>(size);
	
	public Room(Polar entranceDoor) {
		super();
		sides.put(entranceDoor, ProductManager.getProduct(new DoorCreator()));
		Polar exitDoor=Polar.getLeftPolarRandom(entranceDoor);
		sides.put(exitDoor, ProductManager.getProduct(new DoorCreator()));
		Polar sideOne=Polar.getLeftPolarRandom(entranceDoor,exitDoor);
		sides.put(sideOne, ProductManager.getRandomProductNoDoor());
		Polar sideTwo=Polar.getLeftPolarRandom(entranceDoor,exitDoor,sideOne);
		sides.put(sideTwo, ProductManager.getRandomProductNoDoor());
	}
	
	
}
