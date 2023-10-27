package ejerciciohabitacion0424;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Room {
	private final int size = 4;
	private Map<PolarEnum, Side> sides = new HashMap<>();
	private PolarEnum exitDoor;
	private PolarEnum entranceDoor;
	private RoomPresenter roomPresenter;

	public Room(PolarEnum entranceDoor, RoomPresenter roomPresenter) {
		super();
		this.entranceDoor = entranceDoor;
		this.roomPresenter = roomPresenter;
		sides.put(entranceDoor, Type.getSide(Type.Door));
		exitDoor = PolarEnum.GetRandomLeftPolarEnum(sides.keySet());
		sides.put(exitDoor, Type.getSide(Type.Door));
		int restingSides = sides.size();
		for (int i = 0; i < size - restingSides; i++) {
			sides.put(PolarEnum.GetRandomLeftPolarEnum(sides.keySet()), Type.getRandomSideNoDoor());
		}
	}

	public PolarEnum getExitDoor() {
		return exitDoor;
	}

	public PolarEnum getEntranceDoor() {
		return entranceDoor;
	}

	public void explore() {
		roomPresenter.introduceRoom(this);
	}

	public Side getSide(PolarEnum polar) {
		return sides.get(polar);
	}
	

}
