package modelo;

public enum Combustible {
	fuel(1.65f), gas95(1.76f), gas98(1.87f), adblue(0.55f);

	private float tarifaPorLitro;

	private Combustible(float tarifaPorLitro) {
		this.tarifaPorLitro = tarifaPorLitro;
	}

	public float getTarifaPorLitro() {
		return tarifaPorLitro;
	}

	public void setTarifaPorLitro(float tarifaPorLitro) {
		this.tarifaPorLitro = tarifaPorLitro;
	}

	public float getLitrosPorPrecio(float importeReal) {
		return importeReal/tarifaPorLitro;
	}
}
