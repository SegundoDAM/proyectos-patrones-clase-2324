package ejemplo01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClonar {

	@Test
	void test() throws CloneNotSupportedException {
		String cosa="Hola";
//		((Object)cosa).clone();
		Rectangulo rectangulo = new Rectangulo(15);
		Rectangulo clone = rectangulo.clone();
		assertFalse(rectangulo==clone);
		clone.setLado(23);
		assertNotEquals(rectangulo,clone);
	}
	@Test
	void testClonGrupo() throws CloneNotSupportedException {
		Grupo grupo=new Grupo();
		grupo.setNombre("Edelmiro");
		Grupo clone = grupo.clone();
		assertFalse(grupo==clone);
		assertEquals(clone.getNombre(),grupo.getNombre());
		System.out.println(clone.getNombre());
		grupo.setNombre("Arturo");
		assertNotEquals(clone.getNombre(),grupo.getNombre());
		System.out.println(clone.getNombre());
		System.out.println(grupo.getNombre());
	}
	@Test
	void testClonGrupoRectangulo() throws CloneNotSupportedException {
		Grupo grupo=new Grupo();
		grupo.setLado(9);
		grupo.setNombre("Edelmiro");
		Grupo clone = grupo.clone();
		grupo.setNombre("Arturo");
		grupo.setLado(12);
		assertFalse(clone.getLado()==grupo.getLado());
	}
	@Test
	void testClonGrupoRectanguloConstructor() throws CloneNotSupportedException {
		Grupo grupo=new Grupo();
		grupo.setLado(9);
		grupo.setNombre("Edelmiro");
		Grupo clone = new Grupo(grupo);
		grupo.setNombre("Arturo");
		grupo.setLado(12);
		assertFalse(clone.getLado()==grupo.getLado());
	}

}
