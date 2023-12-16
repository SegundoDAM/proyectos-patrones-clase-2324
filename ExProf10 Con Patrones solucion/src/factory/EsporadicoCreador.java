package factory;

import modelo.TipoPago;

public class EsporadicoCreador implements Creador{
	private String matricula;
	private TipoPago tipoPago;
	
	public EsporadicoCreador(String matricula, TipoPago tipoPago) {
		super();
		this.matricula = matricula;
		this.tipoPago = tipoPago;
	}
	@Override
	public Cliente factoryMethod() {
		return new Cliente(matricula,tipoPago);
	}
	
	
}
