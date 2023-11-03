package implementacion;

public class Persona {
	// Obligatorio
	private String nombre;
	// opcional
	private String nombrePrimogenito;

	private Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	private void setNombrePrimogenito(String nombrePrimogenito) {
		this.nombrePrimogenito = nombrePrimogenito;
	}

	public static class Builder {
		private String nombre;
		// opcional
		private String nombrePrimogenito;

		public void nombrePrimogenito(String nombre){
			this.nombrePrimogenito=nombre;
					
		}

		public Persona build() {
			Persona persona = new Persona(this.nombre);
			persona.setNombrePrimogenito(nombrePrimogenito);
		}

		public Builder(String nombre) {
			super();
			this.nombre = nombre;
		}

	}
}
