package tests;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import modelo.Operacion;
import modelo.Repostaje;
import modelo.RepostajeNoTerminadoException;
import modelo.TarjetaPass;
import modelo.TipoCliente;
import modelo.TipoPago;
import objectMother.OM;

public class FactoryTest {

	@Test
	void factoryTest() {
		OM om = new OM();
		Repostaje repostajeRandom = om.getRepostajeRandom(om.getSurtidores());
		// se puede probar con varios
		TipoCliente tipoCliente = TipoCliente.esporadico;
		String matricula = "1111-bbb";
		TipoPago tipoPago = TipoPago.contado;
		TarjetaPass tarjetaPass = new TarjetaPass();
		String nombre = "Norberto Pacheco";
		float bonificacion = 0.1f;
		String codeApp = "aaaa-111";
		try {
			Optional<Operacion> operacion = crearOperacion(repostajeRandom, tipoCliente, matricula, tipoPago, tarjetaPass,
					nombre, bonificacion, codeApp);
		} catch (RepostajeNoTerminadoException e) {
			e.printStackTrace();
		}
	}

	//El que crea la operacion dependiendo del tipo de cliente debe obtener la informacion necesaria para crear la operacion
	private Optional<Operacion> crearOperacion(Repostaje repostajeRandom, TipoCliente tipoCliente, String matricula,
			TipoPago tipoPago, TarjetaPass tarjetaPass, String nombre, float bonificacion, String codeApp) throws RepostajeNoTerminadoException {
		switch (tipoCliente) {
		case esporadico: {
			return Optional.of(new Operacion(repostajeRandom, LocalDate.now(), matricula, tipoPago));
		}
		case habitual: {
			return Optional.of(new Operacion(repostajeRandom, LocalDate.now(), matricula, tarjetaPass));
		}
		case asociado: {

			return Optional.of(new Operacion(repostajeRandom, LocalDate.now(), matricula, nombre, bonificacion, codeApp));
		}
		default:
			return null;
		}
	}
}
