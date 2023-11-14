package ejercicio03;

public class ArmaduraSuperior implements Nave {
	private Nave nave;
	
	public ArmaduraSuperior(Nave nave) {
		super();
		this.nave = nave;
	}

	@Override
	public String dispara() {
		return nave.dispara();
	}

	@Override
	public Nave quitarDisparo() {
		return nave.quitarDisparo();
	}

	@Override
	public int ponerArmadura() {
		return nave.ponerArmadura()+3;
	}

	@Override
	public Nave quitarArmadura() {
		return nave;
	}

	@Override
	public Nave quitarCapa() {
		return nave;
	}

}
