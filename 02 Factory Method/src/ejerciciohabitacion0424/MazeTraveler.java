package ejerciciohabitacion0424;

public class MazeTraveler {

	public void travel(Maze maze) {

		Room room;
		room = maze.enteringMaze();
		do {
			room.explore();
			room = maze.enteringNextRoom(room).orElse(null);
		} while (room != null);
	}

	
}
