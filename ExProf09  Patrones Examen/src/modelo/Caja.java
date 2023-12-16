package modelo;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Caja {
	// Esto gusta?
	Map<Long, Par<TipoPago, Float>> pagos;

	public Caja() {
		pagos = new HashMap();
	}

	public void procesarPago(long idRepostaje, float cantidad, TipoPago tipoPago) {
		pagos.put(idRepostaje, new Par<TipoPago, Float>(tipoPago, cantidad));
	}

	public Optional<Par<TipoPago, Float>> getPagoByIdRepostaje(long idRepostaje) {
		return Optional.of(pagos.get(idRepostaje));
	}

}
