package ejerciciohabitacion0424;

import org.junit.jupiter.api.Test;

class Roomtest {

	@Test
	void test() {
		Maze maze=new Maze(5,new RoomPresenterConsole());
		MazeTraveler traveler=new MazeTraveler();
		traveler.travel(maze);
	}

}
