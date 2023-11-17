package esquema00;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FlyWeightFactory {
public List<FlyWeight> cache;

public FlyWeightFactory() {
	super();
	cache=new ArrayList<>();
}
public FlyWeight getFlyWeight(String repeting) {
	Optional<FlyWeight> findFirst = cache.stream()
			.filter((fly)->{return fly.contains(repeting);})
			.findFirst();
	FlyWeight retorno=null;
	if(findFirst.isEmpty()) {
		retorno=new FlyWeight(repeting);
		cache.add(retorno);
	}else {
		retorno=findFirst.get();
	}
	return retorno;
}
}
