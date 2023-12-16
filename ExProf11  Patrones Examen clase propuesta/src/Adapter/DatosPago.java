package Adapter;

import modelo.TipoPago;

public class DatosPago {
	long idRepostaje;
	float cantidad;
	TipoPago tipoPago;

	public DatosPago(long idRepostaje, float cantidad, TipoPago tipoPago) {
		super();
		this.idRepostaje = idRepostaje;
		this.cantidad = cantidad;
		this.tipoPago = tipoPago;
	}
}
