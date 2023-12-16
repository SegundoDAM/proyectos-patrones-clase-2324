package ejericio02;

public class Facade {
	AccesorBBDD accesor;

	public Facade() {
		super();
		accesor = new AccesorBBDD();
	}

	public void grabar(A a) {
		accesor.grabarA(a);
	}

	public void grabar(B b) {
		accesor.grabarB(b);
	}

	public void grabar(C c) {
		accesor.grabarC(c);
	}
}
