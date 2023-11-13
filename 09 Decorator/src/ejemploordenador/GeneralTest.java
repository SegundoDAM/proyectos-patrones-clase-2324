package ejemploordenador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneralTest {
	Ordenador presupuesto=new OrdenadorBase();

	@Test
	void test() {
		
		presupuesto=new Procesador(presupuesto);
		presupuesto=new DiscoDuro(presupuesto);
		System.out.println(presupuesto.calculateCost());
		presupuesto=presupuesto.unWrapped();
		System.out.println(presupuesto.calculateCost());
	}

}
