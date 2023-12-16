package modelo;

public class Deposito {

	private Combustible combustible;
	private float capacidad;
	private float cantidadActual;
	
	public Deposito(Combustible combustible, float capacidad, float cantidadActual) {
		super();
		this.combustible = combustible;
		this.capacidad = capacidad;
		this.cantidadActual = cantidadActual;
	}

	public Combustible getCombustible() {
		return combustible;
	}

	public boolean isCombustible(Combustible combustible) {
		return this.combustible==combustible;
	}
	public float getCapacidad() {
		return capacidad;
	}

	private void setCapacidad(float capacidad) {
		this.capacidad = capacidad;
	}

	public float getCantidadActual() {
		return cantidadActual;
	}

	private void setCantidadActual(float cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	private void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}

	//si el deposito solo puede suplir parte del importe esa es la cifra que nos entregara
	//pondra el deposito a cero
	public float reducirCantidadActual(float importeReal) {
//		System.out.println("combustible "+combustible);
//		System.out.println("antes de reducir "+cantidadActual);
		cantidadActual-=combustible.getLitrosPorPrecio(importeReal);
//		System.out.println("la cantidad actual "+cantidadActual);
		return importeReal-comprobarExceso();
	}

	private float comprobarExceso() {
		float faltante=0;
		if(cantidadActual<0) {
			faltante=Math.abs(cantidadActual);
			cantidadActual=0;
		}
		return faltante*combustible.getTarifaPorLitro();
	}

	public boolean isEmpty() {
		return cantidadActual<=0;
	}

	@Override
	public String toString() {
		return "tipo "+combustible;
	}
}
