package listenerJava801;

public class Listenear {
public static void main(String[] args) {
	Cambiador cambiador=new Cambiador();
	Intraquilador intraquilador=new Intraquilador();
	cambiador.addPropertyChangeListener(intraquilador);
	cambiador.setValue("Locaza");
}
}
