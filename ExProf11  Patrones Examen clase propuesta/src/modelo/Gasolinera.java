package modelo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import Adapter.AdapterPagosVersionJava8;
import factory.Pago;
import objectMother.OM;
import observer.Surtidor;

public class Gasolinera {
	List<Operacion> operaciones;
	List<Surtidor> surtidores;
	Caja caja;
	OM om;

	public Gasolinera() {
		OM om = new OM();
		surtidores = om.getSurtidores();
		operaciones = new LinkedList<Operacion>();
		caja = new Caja();
	}

//////////////////////////////////////////////////////////
	public Repostaje solicitarRepostaje(Surtidor surtidor, Combustible combustible, int importeReal) {
		if (surtidor.isCombustibleDisponible(combustible))
			return new Repostaje(surtidor, combustible,importeReal);
		return null;
	}

	public Operacion realizarOperacion(Repostaje repostaje, Pago pago, LocalDate localDate) {
		if (repostaje.isTerminado()) {
			Operacion operacion = null;
			try {
				operacion = new Operacion(repostaje, localDate, pago);
			} catch (RepostajeNoTerminadoException e) {
				e.printStackTrace();
			}
			operaciones.add(operacion);
			return operacion;
		}
		return null;
	}
	
	/////////////////////El adapter 
	public void realizarPago(Operacion operacion) {
		new AdapterPagosVersionJava8() {
		}.procesarPago(caja, operacion);
	}

	private List<Operacion> getOperacionesByAsociado(String nombre) {
		return operaciones.stream()
		.filter((operacion)->{return operacion.compruebaAsociado(nombre);})
		.collect(Collectors.toList());
	}

	public float getTotalOperacionesAsociadoConBonificacicon(String nombre) {
		return (float) getOperacionesByAsociado(nombre).stream().mapToDouble((operacion) -> {
			return operacion.getTotalBonificado();
		}).sum();
	}

	private List<Operacion> getOperaciones() {
		return operaciones;
	}

	private void setOperaciones(List<Operacion> operaciones) {
		this.operaciones = operaciones;
	}

	public List<Surtidor> getSurtidores() {
		return surtidores;
	}

	private void setSurtidores(List<Surtidor> surtidores) {
		this.surtidores = surtidores;
	}

	private Caja getCaja() {
		return caja;
	}

	private void setCaja(Caja caja) {
		this.caja = caja;
	}

	private OM getOm() {
		return om;
	}

	private void setOm(OM om) {
		this.om = om;
	}

}
