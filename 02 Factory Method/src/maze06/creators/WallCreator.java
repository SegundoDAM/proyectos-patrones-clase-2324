package maze06.creators;

import maze06.products.Side;
import maze06.products.Wall;

public class WallCreator implements CreatorAbstract {

	@Override
	public Side factoryMethod() {
		return new Wall();
	}

}
