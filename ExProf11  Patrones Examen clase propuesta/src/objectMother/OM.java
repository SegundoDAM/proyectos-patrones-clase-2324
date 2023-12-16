package objectMother;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

import modelo.Combustible;
import modelo.Deposito;
import modelo.Repostaje;
import modelo.Surtidor;
import modelo.TipoPago;

public class OM {
	List<Surtidor> surtidores;

	// OM prefijados
	public List<Deposito> getDepositos() {
		List<Deposito> depositos = new LinkedList<Deposito>();

		// Generar depósitos para cada tipo de combustible
		depositos.add(new Deposito(Combustible.fuel, 1000, 500));
		depositos.add(new Deposito(Combustible.fuel, 1500, 800));

		depositos.add(new Deposito(Combustible.gas95, 500, 400));
		depositos.add(new Deposito(Combustible.gas95, 1200, 600));

		depositos.add(new Deposito(Combustible.gas98, 700, 350));
		depositos.add(new Deposito(Combustible.gas98, 1000, 500));

		depositos.add(new Deposito(Combustible.adblue, 500, 250));
		depositos.add(new Deposito(Combustible.adblue, 700, 350));

		return depositos;
	}

	public List<Surtidor> getSurtidores() {
		if (surtidores == null) {
			surtidores = new ArrayList<>();
			int[][] posiciones = { { 2, 4 }, { 0, 6 }, { 1, 7, 3, 5 }, { 0, 6, 2, 4 } };
			List<Deposito> list = getDepositos().stream().toList();
			LinkedList<Deposito> seleccion;
			for (int i = 0; i < posiciones.length; i++) {
				seleccion = new LinkedList();
				for (int j = 0; j < posiciones[i].length; j++) {
					seleccion.add(list.get(posiciones[i][j]));
				}
				surtidores.add(new Surtidor(i, seleccion));
			}
		}
		return surtidores;
	}

	public Optional<Repostaje> getRepostaje(int surtidor, Combustible combustible, float importeReal) {
		Repostaje repostaje = null;
		Surtidor surtidor2 = surtidores.get(surtidor);
		if (surtidor2.isCombustibleDisponible(combustible)) {
			repostaje = new Repostaje(surtidor2, combustible,importeReal);
		}
		return Optional.of(repostaje);
	}

	public Repostaje getRepostajeRandom(List<Surtidor> surtidores) {
		Random random = new Random();
		Surtidor surtidor = surtidores.get(random.nextInt(surtidores.size()));
		Combustible combustible = surtidor.getDepositos().iterator().next().getCombustible();
		int cantidad = random.nextInt(50) + 10;
		if (random.nextInt(10) == 0) {
			cantidad *= 0.9;
		}
		Repostaje repostaje = new Repostaje(surtidor, combustible,cantidad);
		return repostaje;
	}

	private TipoPago getRandomTipoPago() {
		Random random = new Random();
		int index = random.nextInt(TipoPago.values().length);
		return TipoPago.values()[index];
	}

}
