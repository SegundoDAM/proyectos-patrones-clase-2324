package Adapter;

import modelo.Caja;
import modelo.Operacion;

public class AdapterPagosVersionJava6 {
	Caja caja; Operacion operacion;
	
	public AdapterPagosVersionJava6(Caja caja, Operacion operacion) {
		super();
		this.caja = caja;
		this.operacion = operacion;
	}

	public void procesarPago() {
		caja.procesarPago(operacion.getRepostaje().getId(), operacion.getRepostaje().getCantidad(),
				operacion.getPago().getTipoPago());
	}
}
