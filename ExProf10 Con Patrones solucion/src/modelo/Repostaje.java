package modelo;

public class Repostaje {
	private static long lastId = 0;
	private long id = -1;
	private Surtidor surtidor;
	private Combustible combustible;
	private float cantidad = 0;
	private float importeReal = 0;
	private boolean terminado;

	public Repostaje(Surtidor surtidor, Combustible combustible, float importe) {
		super();
		terminado=false;
		boolean combustibleDisponible = surtidor.isCombustibleDisponible(combustible);
		if (combustibleDisponible) {
			this.id = ++lastId;
			this.surtidor = surtidor;
			this.combustible = combustible;
			cerrarRepostaje(importe);
		}
	}

	private static long getLastId() {
		return lastId;
	}

	private static void setLastId(long lastId) {
		Repostaje.lastId = lastId;
	}

	public long getId() {
		return id;
	}

	public Surtidor getSurtidor() {
		return surtidor;
	}

	private void setSurtidor(Surtidor surtidor) {
		this.surtidor = surtidor;
	}

	public Combustible getCombustible() {
		return combustible;
	}

	private void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}

	public float getCantidad() {
		return cantidad;
	}

	private void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public float getImporteReal() {
		return importeReal;
	}

	private void setImporteReal(float importe) {
		this.importeReal = importe;
	}

	public void cerrarRepostaje(float importe) {
		this.importeReal = this.surtidor.cerrarRepostaje(importe, combustible);
		this.cantidad = this.importeReal / combustible.getTarifaPorLitro();
		terminado = true;
	}

	public boolean isTerminado() {
		return terminado;
	}

	private void setTerminado(boolean terminado) {
		this.terminado = terminado;
	}

}
