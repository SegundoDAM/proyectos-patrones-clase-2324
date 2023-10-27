package maze06.creators;

import maze06.products.Side;
import maze06.products.Window;

public class WindowCreator implements CreatorAbstract{

	@Override
	public Side factoryMethod() {
		return new Window();
	}

}
