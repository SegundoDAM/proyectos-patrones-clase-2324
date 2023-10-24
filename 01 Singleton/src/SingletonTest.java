import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
	void test() {
		Singleton uno=Singleton.getINSTANCIA();
		uno.setCosa(7);
		Singleton dos=Singleton.getINSTANCIA();
		System.out.println(dos.getCosa());
		LocalDate of = LocalDate.of(1994, 1, 1);
	}

}
