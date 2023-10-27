package ejerciciohabitacion0424;

import java.util.Set;

public class RoomPresenterConsole implements RoomPresenter{

	@Override
	public void introduceSide(PolarEnum polarEnum, Side side) {
		System.out.print("En el lado "+polarEnum);
		System.out.println(" hay una "+side.toString());
	}

	@Override
	public void introduceRoom(Room room) {
		System.out.println("presentando la habitacion ");
		System.out.println("entrada "+room.getEntranceDoor());
		System.out.println("salida "+room.getExitDoor());
		PolarEnum.getLeftPolarEnum(Set.of(room.getEntranceDoor(),room.getExitDoor())).stream()
		.forEach((polar)->{System.out.println("lado "+polar+" es "+room.getSide(polar));});
	}

	

}
