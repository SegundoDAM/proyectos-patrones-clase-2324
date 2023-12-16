package tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import modelo.Caja;
import modelo.Operacion;
import modelo.Par;
import modelo.Repostaje;
import modelo.RepostajeNoTerminadoException;
import modelo.TipoPago;
import objectMother.OM;

public class AdapterTest {

	@Test
	void AdaptTestEsporadico() {
		//operacion esporadica con repostaje random 
		Caja instance = new Caja();
		String matricula = null;
		OM om = new OM();
		Operacion operacion = null;
		try {
			operacion = new Operacion(om.getRepostajeRandom(om.getSurtidores()), LocalDate.now(),matricula,
					TipoPago.contado);
		} catch (RepostajeNoTerminadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Repostaje repostaje = operacion.getRepostaje();
		//Aqui el adapter para no pasar tres parametros a la caja
		instance.procesarPago(repostaje.getId(), repostaje.getImporteReal(), operacion.getTipoPago());
		Optional<Par<TipoPago, Float>> pagoByIdRepostaje = instance.getPagoByIdRepostaje(repostaje.getId());
		Par<TipoPago, Float> par = pagoByIdRepostaje.get();
		assertNotNull(par);
		assertTrue(par.getFirst()==operacion.getTipoPago()&&par.getSecond()==repostaje.getImporteReal());
	}
		
}
