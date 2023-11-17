package kata;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class KataStreamTest {

	@Test
	void testHowManyNumbersBiggerThanXbeforeZ() {
		int hundred = 100;
		int below = 23;
		List<Integer> list = List.of(hundred,hundred,hundred,below,below,hundred,hundred,hundred,hundred,hundred);
		int half=list.size()/2;
		int expected = 3;
		assertEquals(expected,new KataStream().howManyNumbersBiggerThanXbeforeZ(null, hundred, half));
	}

}
