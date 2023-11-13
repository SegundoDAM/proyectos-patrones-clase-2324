package ejemploPersonaje;

public abstract class Personaje {

	public abstract int mostrarArmadura();

	public  Personaje decrementaElemento() {
		return this;
	};

	public abstract int mostrarFuerza();

}
