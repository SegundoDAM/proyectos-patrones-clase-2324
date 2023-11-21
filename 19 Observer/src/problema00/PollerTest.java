package problema00;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

class PollerTest {

	@Test
	void test() throws InterruptedException {
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		Generator task = new Generator();
		newCachedThreadPool.execute(task);
		newCachedThreadPool.execute(new Poller(task));
		newCachedThreadPool.awaitTermination(100, TimeUnit.SECONDS);
	}

}
