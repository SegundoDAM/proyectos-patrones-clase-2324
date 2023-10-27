package ejerciciohabitacion0424;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PolarEnumTest {

	@Test
	void testGetOppositePolar() {
		assertEquals(PolarEnum.North,PolarEnum.getOppositePolar(PolarEnum.South));
		assertEquals(PolarEnum.South,PolarEnum.getOppositePolar(PolarEnum.North));
		assertEquals(PolarEnum.East,PolarEnum.getOppositePolar(PolarEnum.West));
		assertEquals(PolarEnum.West,PolarEnum.getOppositePolar(PolarEnum.East));
	}

}
