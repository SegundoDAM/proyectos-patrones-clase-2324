package maze06.creators;

import maze06.products.Door;
import maze06.products.Side;

public class DoorCreator implements CreatorAbstract {

	@Override
	public Side factoryMethod() {
		return new Door();
	}

}
