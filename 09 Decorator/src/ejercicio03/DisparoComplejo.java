package ejercicio03;

public class DisparoComplejo implements Nave {

	private Nave nave;
	
	public DisparoComplejo(Nave nave) {
		super();
		this.nave = nave;
	}

	@Override
	public String dispara() {
		return nave.dispara()+ " disparo complejo";
	}

	@Override
	public Nave quitarDisparo() {
		return nave.quitarDisparo();
	}

	@Override
	public int ponerArmadura() {
		return nave.ponerArmadura();
	}

	@Override
	public Nave quitarArmadura() {
		return this.quitarArmadura();
	}

	@Override
	public Nave quitarCapa() {
		return nave;
	}

}
