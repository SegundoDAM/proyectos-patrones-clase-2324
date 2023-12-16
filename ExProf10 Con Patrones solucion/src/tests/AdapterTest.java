package tests;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import factory.Cliente;
import factory.EsporadicoCreador;
import modelo.Caja;
import modelo.Operacion;
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
			operacion = new Operacion(om.getRepostajeRandom(om.getSurtidores()), LocalDate.now(),new EsporadicoCreador("kkk",TipoPago.contado).factoryMethod());
		} catch (RepostajeNoTerminadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Repostaje repostaje = operacion.getRepostaje();
		//Aqui el adapter para no pasar tres parametros a la caja
		instance.procesarPago(repostaje.getId(), repostaje.getImporteReal(), operacion.geTipoPago());
	}
		
}
