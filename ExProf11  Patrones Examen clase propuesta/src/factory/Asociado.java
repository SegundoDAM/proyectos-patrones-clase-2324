package factory;

import modelo.TipoPago;

public class Asociado extends Cliente implements Pago {

	private String nombreYApellidos = "";
	private float bonificacion = 0.1f;
	private String codeApp;

	public Asociado(String matricula, String nombreYApellidos, float bonficacion, String codeApp) {
		super(matricula, TipoPago.aplicacion);
		this.nombreYApellidos = nombreYApellidos;
		this.bonificacion = bonficacion;
		this.codeApp = codeApp;
	}

	@Override
	public float realizarpago(int importe) {
		System.out.println("el cliente asociado esta repostando");
		System.out.println("tipo de pago "+getTipoPago());
		System.out.println("aplicando la bonificacion "+bonificacion);
		return importe-importe*bonificacion;
	}
	
	public String getNombreYApellidos() {
		return nombreYApellidos;
	}

	public void setNombreYApellidos(String nombreYApellidos) {
		this.nombreYApellidos = nombreYApellidos;
	}

	@Override
	public float getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(float bonficacion) {
		this.bonificacion = bonficacion;
	}

	public String getCodeApp() {
		return codeApp;
	}

	public void setCodeApp(String codeApp) {
		this.codeApp = codeApp;
	}
	
	@Override
	public boolean isAsociado() {
		return !super.isAsociado();
	}
		
	@Override
	public boolean equalsNombreAsociado(String nombre) {
		return this.nombreYApellidos.equals(nombre);
	}
}
