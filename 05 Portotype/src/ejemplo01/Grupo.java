package ejemplo01;

public class Grupo implements Cloneable {
	private Rectangulo miREc = new Rectangulo(0);
	private String nombre;

	
	public Grupo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Grupo(Grupo grupo) throws CloneNotSupportedException {
		Grupo clone = grupo.clone();
		this.nombre=clone.getNombre();
		this.miREc=clone.miREc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = new String(nombre);
	}

	@Override
	protected Grupo clone() throws CloneNotSupportedException {
		Grupo clone = (Grupo) super.clone();
		clone.miREc=this.miREc.clone();
		return clone;
	}

	public int getLado() {
		return miREc.getLado();
	}

	public void setLado(int lado) {
		miREc.setLado(lado);
	}

	public int hashCode() {
		return miREc.hashCode();
	}

	public boolean equals(Object obj) {
		return miREc.equals(obj);
	}

	public String toString() {
		return miREc.toString();
	}

}
