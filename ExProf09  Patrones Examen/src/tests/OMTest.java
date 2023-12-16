package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

import modelo.Deposito;
import modelo.Repostaje;
import modelo.Surtidor;
import objectMother.OM;

public class OMTest {

	@Test
	void testGetSurtidoresNoRandom() {
		OM tuClase = new OM();
		System.out.println("om");
		List<Surtidor> surtidores = tuClase.getSurtidores();
		assertNotNull(surtidores);
		int cantidadSurtidores = 4;
		assertEquals(cantidadSurtidores, surtidores.size());
		for (Surtidor surtidor : surtidores) {
			assertTrue(surtidor.getNumero() >= 0 && surtidor.getNumero() < cantidadSurtidores);
			assertNotNull(surtidor.getDepositos());
			assertFalse(surtidor.getDepositos().isEmpty());
			for (Deposito deposito : surtidor.getDepositos()) {
				assertTrue(deposito.getCombustible() != null);
				assertTrue(deposito.getCapacidad() > 0);
				assertTrue(
						deposito.getCantidadActual() >= 0 && deposito.getCantidadActual() <= deposito.getCapacidad());
			}
		}
	}

	@Test
	public void testGetDepositosOM() {
		OM om = new OM();
		List<Deposito> depositos = om.getDepositos();
		assertNotNull(depositos);
		assertFalse(depositos.isEmpty());
	}

	@Test
	public void testGetRandomRepostaje() {
		OM om = new OM();
		List<Surtidor> surtidores = om.getSurtidores();
		Repostaje repostaje = om.getRepostajeRandom(surtidores);
		assertNotNull(repostaje);
		assertNotNull(repostaje.getSurtidor());
		assertNotNull(repostaje.getCombustible());

	}
}
