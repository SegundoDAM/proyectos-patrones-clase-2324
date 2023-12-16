package modelo;

import java.time.LocalDate;
import java.util.Optional;

import factory.Asociado;
import factory.Pago;

public class Operacion {
	private Repostaje repostaje;
	private LocalDate fecha;
	private Pago pago;

	public Operacion(Repostaje repostaje, LocalDate fecha, Pago pago) throws RepostajeNoTerminadoException {
		super();
		if (!repostaje.isTerminado())
			throw new RepostajeNoTerminadoException();
		this.repostaje = repostaje;
		this.fecha = fecha;
		this.pago = pago;
	}

	public Pago getPago() {
		return pago;
	}

	public Repostaje getRepostaje() {
		return repostaje;
	}

	private void setRepostaje(Repostaje repostaje) {
		this.repostaje = repostaje;
	}

	private LocalDate getFecha() {
		return fecha;
	}

	private void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public TipoPago geTipoPago() {
		return pago.getTipoPago();
	}

	// no me gusta nada
	public Optional<Asociado> getAsociado(String nombre) {
		if (pago instanceof Asociado) {
			Asociado asociado = (Asociado) pago;
			if (asociado.getMatricula().equals(nombre))
				return Optional.of(asociado);
		}
		return null;
	}
	
	public float getBonificacion(Pago pago) {
		return pago.getBonificacion();
	}

	public float aplicarBonificacion() {
		 return repostaje.getImporteReal()
			- repostaje.getImporteReal() * pago.getBonificacion();	
		
	}

	public boolean compruebaAsociado(String nombre) {
		return this.pago.isAsociado()&&this.pago.equalsNombreAsociado(nombre);
	}

	public double getTotalBonificado() {
		return  getRepostaje().getImporteReal()
			- getRepostaje().getImporteReal() * aplicarBonificacion();
	}

}
