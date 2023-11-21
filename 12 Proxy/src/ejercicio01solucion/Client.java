package ejercicio01solucion;

public class Client {
	ServicioBBDD servicioBBDD;

	public Client() {
		super();

		// hace mas cosas
		System.out.println("carga terminada");
	}

	public void operarEnOtroSitio() {
		System.out.println("no tiene que ver con la bbdd");
	}

	public void operarEnBBDD() {
		if (servicioBBDD == null) {
			System.out.println("arrancando el servicio de bbdd");
			servicioBBDD = new ServicioBBDD();
		}
		System.out.println("operando en base ");
		servicioBBDD.operation();
	}
}
