package ejemploordenador;

public class OrdenadorBase extends Ordenador {
	// Pero aqui no existe la propiedad Ordenaador
	@Override
	public float calculateCost() {
		System.out.println("mio actual base");
		return 0;
	}

	@Override
	public Ordenador unWrapped() {
		// TODO Auto-generated method stub
		return null;
	}

}
