package Adapter;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import Adapter.AdapterPagosVersionJava8;
import factory.Pago;
import modelo.Caja;
import modelo.Combustible;
import modelo.Operacion;
import modelo.Repostaje;
import modelo.RepostajeNoTerminadoException;
import objectMother.OM;
import observer.Surtidor;

public class GasolineraTercerAdapter {
	List<Operacion> operaciones;
	List<Surtidor> surtidores;
	CajaTercerVersionAdapter caja;
	OM om;

	public GasolineraTercerAdapter() {
		OM om = new OM();
		surtidores = om.getSurtidores();
		operaciones = new LinkedList<Operacion>();
		caja = new CajaTercerVersionAdapter();
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
		Mapper<DatosPago,Operacion> mapper = new Mapper<DatosPago,Operacion>() {

			@Override
			public DatosPago map(Operacion t) {
				return new DatosPago(t.getRepostaje().getId(), t.getRepostaje().getImporteReal(), t.geTipoPago());
			}
		
		};
		//Y aqui la adaptacion
		caja.procesarPago(mapper.map(operacion));
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

	private CajaTercerVersionAdapter getCaja() {
		return caja;
	}

	private void setCaja(CajaTercerVersionAdapter caja) {
		this.caja = caja;
	}

	private OM getOm() {
		return om;
	}

	private void setOm(OM om) {
		this.om = om;
	}

}
