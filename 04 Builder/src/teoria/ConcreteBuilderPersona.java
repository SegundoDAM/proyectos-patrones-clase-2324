package teoria;

public class ConcreteBuilderPersona extends Builder {

	Persona persona;

	@Override
	public void buildPart() {
		this.persona = new Persona();
	}

	public Persona getPersona() {
		return persona;
	}

}
