package observer;

import java.beans.PropertyChangeSupport;

import modelo.Combustible;

public class Deposito extends PropertyChangeSupport{

	private Combustible combustible;
	private float capacidad;
	private float cantidadActual;
	
	
	public Deposito(Combustible combustible, float capacidad, float cantidadActual) {
		super(capacidad);
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

	public float reducirCantidadActual(float importeReal) {
		cantidadActual-=combustible.getLitrosPorPrecio(importeReal);
		return importeReal-comprobarExceso();
	}

	private float comprobarExceso() {
		float faltante=0;
		if(isEmpty()) {
			faltante=Math.abs(cantidadActual);
			cantidadActual=0;
			firePropertyChange("vacio",null,this);
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
