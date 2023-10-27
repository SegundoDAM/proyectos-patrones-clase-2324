package ejerciciohabitacion0424;

import java.util.LinkedList;
import java.util.Optional;

public class Maze {
	private int amountOfRooms=2;
	private LinkedList<Room> rooms;
	private PolarEnum initialPolarEnum;
	private RoomPresenter roomPresenter;
	
	public Maze(int amountOfRooms,RoomPresenter roomPresenter) {
		super();
		this.amountOfRooms = amountOfRooms;
		this.roomPresenter=roomPresenter;
		rooms=new LinkedList<>();
		initialPolarEnum=PolarEnum.getRandomPolarEnum();
		createMaze(initialPolarEnum);
	}

	private void createMaze(PolarEnum currentPolarEnum) {
		for (int i = 0; i < amountOfRooms; i++) {
			Room currentRoom = new Room(currentPolarEnum,roomPresenter);
			currentPolarEnum=PolarEnum.getOppositePolar(currentRoom.getExitDoor());
			rooms.add(currentRoom);
		}
	}

	public Maze(RoomPresenter roomPresenter) {
		this(2,roomPresenter);
	}
	
	public PolarEnum getInitialPolarEnum() {
		return initialPolarEnum;
	}

	private void setInitialPolarEnum(PolarEnum initialPolarEnum) {
		this.initialPolarEnum = initialPolarEnum;
	}

	public Room enteringMaze() {
		return rooms.get(0);
	}

	public Optional<Room> enteringNextRoom(Room room) {
		return Optional.ofNullable(rooms.get(rooms.indexOf(room)+1));
	}
	
}
