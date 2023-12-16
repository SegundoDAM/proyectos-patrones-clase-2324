package modelo;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Surtidor implements PropertyChangeListener {
	private int numero;
	private List<Deposito> depositos;

	public Surtidor(int numero, List<Deposito> depositos) {
		super();
		this.numero = numero;
		this.depositos = depositos;
		addListeners();
	}

	private void addListeners() {
		depositos.forEach(depo->depo.addPropertyChangeListener(this));
	}

	public List<Deposito> getDepositos() {
		return this.depositos;
	}

	public boolean isCombustibleDisponible(Combustible combustible) {
		// Esto sobra si tienes listener
//		List<Deposito> collect = depositos.stream()
//				.filter((deposito)->{return deposito.isEmpty();})
//				.collect(Collectors.toList());
//		depositos.removeAll(collect);
		return depositos.stream().anyMatch((deposito) -> {
			return deposito.isCombustible(combustible);
		});
	}

	public int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		this.numero = numero;
	}

	private void setDepositos(List<Deposito> depositos) {
		this.depositos = depositos;
	}

	public float cerrarRepostaje(float importe, Combustible combustible) {
		Optional<Deposito> findFirst = depositos.stream().filter((deposito) -> {
			return deposito.isCombustible(combustible);
		}).findFirst();
		if (findFirst.isPresent())
			return findFirst.get().reducirCantidadActual(importe);
		// Esto sobra si tienes listener
//		if(findFirst.isEmpty()) {
//			depositos.remove(findFirst);
//		}
		return 0;
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		depositos.remove(evt.getNewValue());
	}

}
