package modelo;

import java.time.LocalDate;

public class Operacion {
	private Repostaje repostaje;
	private LocalDate fecha;
	private String matricula;

	// cuando el repostaje lo hace un cliente no habitual
	private TipoPago tipoPago;
	// un cliente habitual solo puede pagar con tarjeta
	private TarjetaPass tarjeta;
	// Los asociados
	private String nombreYApellidos="";
	private float bonficacion = 0.1f;
	private String codeApp;

	public float getBonficacion() {
		return bonficacion;
	}

	private Operacion(Repostaje repostaje, LocalDate fecha, String matricula) throws RepostajeNoTerminadoException {
		super();
		if(!repostaje.isTerminado()) throw new RepostajeNoTerminadoException();
		this.repostaje = repostaje;
		this.fecha = fecha;
		this.matricula = matricula;
	}

	public Operacion(Repostaje repostaje, LocalDate fecha, String matricula, TipoPago tipoPagoEsporadico) throws RepostajeNoTerminadoException {
		this(repostaje,fecha,matricula);
		this.tipoPago = tipoPagoEsporadico;
	}

	public Operacion(Repostaje repostaje, LocalDate fecha, String matricula, TarjetaPass tarjeta) throws RepostajeNoTerminadoException {
		this(repostaje,fecha,matricula);
		this.tarjeta = tarjeta;
		this.tipoPago = TipoPago.tarjeta;
	}

	public Operacion(Repostaje repostaje, LocalDate fecha, String matricula, String nombreYApellidos, float bonficacion,
			String codeApp) throws RepostajeNoTerminadoException {
		this(repostaje,fecha,matricula);
		this.nombreYApellidos = nombreYApellidos;
		this.bonficacion = bonficacion;
		this.codeApp = codeApp;
		this.tipoPago = TipoPago.aplicacion;
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

	public TipoPago getTipoPago() {
		return tipoPago;
	}

	public boolean isAsociado() {
		return nombreYApellidos.isEmpty();
	}

	public boolean equalsNombre(String nombre) {
		return this.nombreYApellidos.equals(nombre);
	}

}
