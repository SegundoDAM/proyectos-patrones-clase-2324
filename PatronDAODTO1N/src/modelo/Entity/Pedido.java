package modelo.Entity;

import java.io.Serializable;
import java.time.LocalDate;

public class Pedido implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private LocalDate fecha;
	//Problema
	private Persona persona;
	
	public Pedido(LocalDate fecha, Persona persona) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.persona = persona;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
}
