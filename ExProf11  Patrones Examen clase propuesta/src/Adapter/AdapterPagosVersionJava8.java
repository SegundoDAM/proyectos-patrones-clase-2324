package Adapter;

import modelo.Caja;
import modelo.Operacion;

public interface AdapterPagosVersionJava8 {
	
	public default void procesarPago(Caja caja, Operacion operacion) {
		caja.procesarPago(operacion.getRepostaje().getId(), operacion.getRepostaje().getCantidad(),
				operacion.getPago().getTipoPago());
	}
	
}
