package porrazo;

public class BuilderUser implements Id, Nombre, Apellidos, Opcionales {

	private Persona persona;

	public Id builder() {
		this.persona = new Persona();
		return this;
	}

	@Override
	public Opcionales phone(String phone) {
		persona.phone = phone;
		return this;
	}

	@Override
	public Opcionales color(String color) {
		persona.color = color;
		return this;
	}

	@Override
	public Persona build() {
		return persona;
	}

	@Override
	public Opcionales apellidos(String apellidos) {
		persona.appellidos = apellidos;
		return this;
	}

	@Override
	public Apellidos nombre(String nombre) {
		persona.nombre = nombre;
		return this;
	}

	@Override
	public Nombre id(int id) {
		persona.id = id;
		return this;
	}

}
