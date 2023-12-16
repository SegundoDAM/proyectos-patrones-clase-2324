package modelo;

public class TarjetaPass {
	private static Long idGlobal=1L;
	private Long id;
	private float descuento;

	public TarjetaPass() {
		super();
		this.id = ++idGlobal;
		descuento = .1f;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

	public float obtenerDescuento(float litros) {
		return litros * descuento;
	}
}
