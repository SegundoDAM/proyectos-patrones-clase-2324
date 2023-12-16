package factory;

import modelo.TipoPago;

public class AsociadoCreador implements Creador {
	private String matricula;
	private String nombreYApellidos = "";
	private float bonficacion = 0.1f;
	private String codeApp;

	public AsociadoCreador(String matricula, String nombreYApellidos, float bonficacion, String codeApp) {
		super();
		this.matricula = matricula;
		this.nombreYApellidos = nombreYApellidos;
		this.bonficacion = bonficacion;
		this.codeApp = codeApp;
	}

	@Override
	public Cliente factoryMethod() {
		return new Asociado(matricula, nombreYApellidos, bonficacion, codeApp);
	}

}
