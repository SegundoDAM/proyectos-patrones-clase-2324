package ejercicio03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NaveBaseTest {

	@Test
	void test() {
		Nave naveBase=new NaveBase();
		System.out.println(naveBase.dispara());
	}
	@Test
	void testA() {
		Nave naveBase=new NaveBase();
		System.out.println(naveBase.dispara());
		naveBase=new DisparoComplejo(naveBase);
		naveBase=new ArmaduraSuperior(naveBase);
		System.out.println(naveBase.dispara());
		System.out.println(naveBase.ponerArmadura());
		//ejercicio A
		naveBase=naveBase.quitarDisparo();
		System.out.println(naveBase.dispara());
		System.out.println(naveBase.ponerArmadura());
	}
	@Test
	void testB() {
		Nave naveBase=new NaveBase();
		System.out.println(naveBase.dispara());
		naveBase=new DisparoComplejo(naveBase);
		naveBase=new ArmaduraSuperior(naveBase);
		System.out.println(naveBase.dispara());
		System.out.println(naveBase.ponerArmadura());
		//ejercicio A
		naveBase=naveBase.quitarCapa();
		System.out.println(naveBase.dispara());
		System.out.println(naveBase.ponerArmadura());
	}

}
