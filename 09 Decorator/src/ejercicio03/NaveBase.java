package ejercicio03;

public class NaveBase implements Nave {

	@Override
	public String dispara() {
		return "disparo simple";
	}

	@Override
	public int ponerArmadura() {
		return 1;
	}

	@Override
	public Nave quitarArmadura() {
		return this.quitarArmadura();
	}

	@Override
	public Nave quitarDisparo() {
		return this;
	}

	@Override
	public Nave quitarCapa() {
		return this;
	}

}
