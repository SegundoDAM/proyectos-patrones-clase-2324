package factory;

import modelo.TipoPago;

public class Cliente implements Pago {
	private String matricula;
	private TipoPago tipoPago;
	
	public Cliente(String matricula, TipoPago tipoPago) {
		super();
		this.matricula = matricula;
		this.tipoPago = tipoPago;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public TipoPago getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(TipoPago tipoPago) {
		this.tipoPago = tipoPago;
	}

	@Override
	public float realizarpago(int importe) {
		System.out.println("realizando el pago de cliente esporadico");
		System.out.println("Tipo de pago "+tipoPago);
		return importe;
	}

	@Override
	public Cliente getCliente() {
		return this;
	}

	@Override
	public float getBonificacion() {
		return 0;
	}

	@Override
	public boolean isAsociado() {
		return false;
	}

	@Override
	public boolean equalsNombreAsociado(String nombre) {
		return false;
	}

	
	
}
