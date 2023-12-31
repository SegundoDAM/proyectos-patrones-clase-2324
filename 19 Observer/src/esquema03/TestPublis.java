package esquema03;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

class TestPublis {

	@Test
	void test() throws InterruptedException {
		Productor productor = new Productor("Cosas");
		List.of(
				new Consumidor(productor,"arturo",5),
				new Consumidor(productor,"benito",8),
				new Consumidor(productor,"clodomiro",10),
				new Consumidor(productor,"anselmo",15),
				new Consumidor(productor,"evaristo",20));
		
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		newCachedThreadPool.execute(productor);
		newCachedThreadPool.awaitTermination(10,TimeUnit.SECONDS);
		newCachedThreadPool.shutdown();
		System.out.println("ending main");
	}

}
