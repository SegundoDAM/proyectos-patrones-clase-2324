package ejemploordenador;

public class Procesador extends Componente {
	private Ordenador actual;

	public Procesador(Ordenador actual) {
		this.actual = actual;
	}

	@Override
	public float calculateCost() {
		System.out.println("mio actual procesador "+actual);
		return this.actual.calculateCost() + 200;
	}

	@Override
	public Ordenador unWrapped() {
		// TODO Auto-generated method stub
		return null;
	}

}
