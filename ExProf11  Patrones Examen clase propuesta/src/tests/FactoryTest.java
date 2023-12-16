package tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import factory.Cliente;
import factory.EsporadicoCreador;
import factory.Pago;
import modelo.Operacion;
import modelo.Repostaje;
import modelo.RepostajeNoTerminadoException;
import modelo.TipoPago;
import objectMother.OM;

public class FactoryTest {

	@Test
	void factoryTest() {
		OM om = new OM();
		Repostaje repostajeRandom = om.getRepostajeRandom(om.getSurtidores());
		Cliente factoryMethod = new EsporadicoCreador("kkk",TipoPago.contado).factoryMethod();
		Optional<Operacion> operacion=Optional.ofNullable(null);
		try {
			operacion= crearOperacion(repostajeRandom, factoryMethod);
		} catch (RepostajeNoTerminadoException e) {
			
		}
		assertTrue(operacion.get().getPago().getCliente().equals(factoryMethod));
	}

	private Optional<Operacion> crearOperacion(Repostaje repostajeRandom, Pago pago) throws RepostajeNoTerminadoException{
		return Optional.of(new Operacion(repostajeRandom,LocalDate.now(),pago));
	}	
}
