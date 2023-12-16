package modelo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import objectMother.OM;

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

	public Operacion realizarOperacionEsporadico(Repostaje repostaje, String matricula, LocalDate localDate,
			TipoPago tipoPago) {
		if (repostaje.isTerminado()) {
			Operacion operacion = null;
			try {
				operacion = new Operacion(repostaje, localDate, matricula, tipoPago);
			} catch (RepostajeNoTerminadoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			operaciones.add(operacion);
			return operacion;
		}
		return null;
	}

	public Operacion realizarOperacionHabitual(Repostaje repostaje, String matricula, LocalDate localDate,
			TarjetaPass pass) {
		if (repostaje.isTerminado()) {
			Operacion operacion = null;
			try {
				operacion = new Operacion(repostaje, localDate, matricula, pass);
			} catch (RepostajeNoTerminadoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			operaciones.add(operacion);
			return operacion;
		}
		return null;
	}

	public Operacion realizarOperacionAsociado(Repostaje repostaje, String matricula, LocalDate localDate,
			String nombre, float bonificacion, String codeApp) {
		if (repostaje.isTerminado()) {
			Operacion operacion = null;
			try {
				operacion = new Operacion(repostaje, localDate, matricula, nombre, bonificacion, codeApp);
			} catch (RepostajeNoTerminadoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			operaciones.add(operacion);
			return operacion;
		}
		return null;
	}

	public void realizarPago(Operacion operacion) {
		caja.procesarPago(operacion.getRepostaje().getId(), operacion.getRepostaje().getCantidad(),
				operacion.getTipoPago());
	}

	private List<Operacion> getOperacionesByAsociado(String nombre) {
		return operaciones.stream()
		.filter((operacion)->{return operacion.isAsociado()&&operacion.equalsNombre(nombre);})
		.collect(Collectors.toList());

	}

	public float getTotalOperacionesAsociadoConBonificacicon(String nombre) {
		return (float) getOperacionesByAsociado(nombre).stream().mapToDouble((operacion) -> {
			return operacion.getRepostaje().getImporteReal()
					- operacion.getRepostaje().getImporteReal() * operacion.getBonficacion();
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
