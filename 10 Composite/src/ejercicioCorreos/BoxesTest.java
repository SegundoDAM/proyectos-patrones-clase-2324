package ejercicioCorreos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class BoxesTest {

	@Test
	void test() {
		Element reloj=new Element(10);
		Element pulsera=new Element(10);
		Element funda=new Element(10);
		Box relojBox=new Box(List.of(reloj,pulsera,funda));
		Element consola=new Element(10);
		Element mandoUno=new Element(10);
		Element mandoDos=new Element(10);
		Element cables=new Element(10);
		Box consolaBox=new Box(List.of(consola,mandoUno,mandoDos,cables));
		Box paquete=new Box(List.of(relojBox,consolaBox));
		System.out.println(paquete.sum());
		System.out.println(consolaBox.sum());
	}

}
