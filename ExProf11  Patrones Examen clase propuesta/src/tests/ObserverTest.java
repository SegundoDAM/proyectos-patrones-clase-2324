package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import modelo.Combustible;
import modelo.Deposito;
import modelo.Repostaje;
import modelo.Surtidor;
import objectMother.OM;

public class ObserverTest {

	@Test
	void obserTest() {
		OM om=new OM();
		Surtidor surtidor = om.getSurtidores().get(0);
		List<Deposito> depositos = surtidor.getDepositos();
		Deposito deposito = depositos.get(0);
		Combustible combustible = deposito.getCombustible();
		float cantidadActual = deposito.getCantidadActual();
		float tarifaPorLitro = combustible.getTarifaPorLitro();
		float importetotalDeposito=cantidadActual*tarifaPorLitro;
		int quita = 2;
		float importeTotalSolicitado=importetotalDeposito-quita;
		//primer repostaje todo menos la quita
		Repostaje repostaje=new Repostaje(surtidor,combustible,importeTotalSolicitado);
		cantidadActual = deposito.getCantidadActual();
		assertTrue(repostaje.isTerminado());
		float importePosible=cantidadActual*tarifaPorLitro;
		//segundo repostaje, el doble de la quita anterior
		Repostaje repostajeDos=new Repostaje(surtidor,combustible,quita*2);
		assertEquals(importePosible,repostajeDos.getImporteReal(),.1f);
		assertTrue(repostajeDos.isTerminado());
		cantidadActual = deposito.getCantidadActual();
		//el deposito no debe estar disponible
		Repostaje repostajeTres=new Repostaje(surtidor,combustible,1);
		boolean terminado = repostajeTres.isTerminado();
		assertFalse(terminado);
	}
}
