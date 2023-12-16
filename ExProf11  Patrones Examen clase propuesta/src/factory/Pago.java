package factory;

import modelo.TipoPago;

public interface Pago {
	public float realizarpago(int importe);
	public TipoPago getTipoPago();
	public Cliente getCliente();
	public float getBonificacion();
	public boolean isAsociado();
	public boolean equalsNombreAsociado(String nombre);
}
