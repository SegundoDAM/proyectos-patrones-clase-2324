package factory;

import modelo.TarjetaPass;
import modelo.TipoPago;

public class HabitualCreador implements Creador {
	private String matricula;
	private TipoPago tipoPago;
	private TarjetaPass tarjeta;
	
	

	public HabitualCreador(String matricula, TipoPago tipoPago, TarjetaPass tarjeta) {
		super();
		this.matricula = matricula;
		this.tipoPago = tipoPago;
		this.tarjeta = tarjeta;
	}
	
	@Override
	public Cliente factoryMethod() {
		return new Habitual(matricula,tarjeta);
	}

}
