package repaso;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.locks.Condition;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class IteratorTest {

	private Collection condicion;

	@Test
	void test() {
		Collection c = null;
		Iterator iterators = c.iterator();
		for (Iterator iterator = iterators; iterator.hasNext();) {
			Object object = (Object) iterator.next();
			boolean condicion = false;
			if(condicion) {
				iterator.remove();
			}
		}
		c=(Collection) c.stream().filter((cosa)->{return cosa==condicion;}).collect(Collectors.toList());
	}

}
