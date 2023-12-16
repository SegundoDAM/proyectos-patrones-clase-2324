package factory;

import modelo.TarjetaPass;
import modelo.TipoPago;

public class Habitual extends Cliente implements Pago{
	// un cliente habitual solo puede pagar con tarjeta
		private TarjetaPass tarjeta;

	public Habitual(String matricula, TarjetaPass tarjeta) {
		super(matricula, TipoPago.tarjeta);
		this.tarjeta = tarjeta;
	}

	@Override
	public float realizarpago(int importe) {
		System.out.println("el usuario habitual esta repostando");
		return importe;
	}
}
