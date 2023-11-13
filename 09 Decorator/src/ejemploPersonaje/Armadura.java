package ejemploPersonaje;

public class Armadura extends Caracteristica {
	private Personaje personaje;
	
	
	public Armadura(Personaje personaje) {
		super();
		this.personaje = personaje;
	}

	@Override
	public int mostrarArmadura() {
		return personaje.mostrarArmadura()+1;
	}

	@Override
	public Personaje decrementaElemento() {
		return personaje;
	}

	@Override
	public int mostrarFuerza() {
		return this.personaje.mostrarFuerza();
	}

	

}
