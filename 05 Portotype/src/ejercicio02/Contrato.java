package ejercicio02;

public class Contrato implements Cloneable{
	private int id;
	private String empresa;
	private Persona persona;
	
	public Contrato(int id, String empresa, Persona persona) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.persona = persona;
	}
	@Override
	protected Contrato clone() throws CloneNotSupportedException {
		Contrato clone = (Contrato) super.clone();
		clone.persona=this.getPersona().clone();
		return clone;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public Persona getPersona() {
		return persona;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + id;
		result = prime * result + ((persona == null) ? 0 : persona.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contrato other = (Contrato) obj;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (id != other.id)
			return false;
		if (persona == null) {
			if (other.persona != null)
				return false;
		} else if (!persona.equals(other.persona))
			return false;
		return true;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
}
