package Adapter;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import modelo.Par;
import modelo.TipoPago;

public class CajaTercerVersionAdapter {
	// Esto gusta?
	Map<Long, Par<TipoPago, Float>> pagos;

	public CajaTercerVersionAdapter() {
		pagos = new HashMap();
	}

	public void procesarPago(DatosPago datosPago) {
		pagos.put(datosPago.idRepostaje, new Par<TipoPago, Float>(datosPago.tipoPago, datosPago.cantidad));
	}

	public Optional<Par<TipoPago, Float>> getPagoByIdRepostaje(long idRepostaje) {
		return Optional.of(pagos.get(idRepostaje));
	}

}
