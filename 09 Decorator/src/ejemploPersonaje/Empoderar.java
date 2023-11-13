package ejemploPersonaje;

public class Empoderar extends Caracteristica{
	private Personaje personaje;
	
	
	public Empoderar(Personaje personaje) {
		super();
		this.personaje = personaje;
	}

	@Override
	public int mostrarArmadura() {
		return this.personaje.mostrarArmadura();
	}

	@Override
	public Personaje decrementaElemento() {
		return this.personaje.decrementaElemento();
	}

	@Override
	public int mostrarFuerza() {
		return this.personaje.mostrarFuerza()+1;
	}

	
}
