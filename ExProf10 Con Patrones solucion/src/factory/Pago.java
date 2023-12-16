package factory;

import modelo.TipoPago;

public interface Pago {
	public float realizarpago(int importe);
	public TipoPago geTipoPago();
	public Cliente getCliente();
	public float getBonificacion();
}
