package ejercicio04DataSource;

import org.junit.jupiter.api.Test;

class FileTest {

	@Test
	void test() {
		DataSource base=new FileDataSource();
		base=new EncryptionDecorator(base);
		base=new CompressDecorator(base);
		System.out.println(base.writeData("hola"));
	}

}
