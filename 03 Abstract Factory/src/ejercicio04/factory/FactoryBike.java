package ejercicio04.factory;

import java.util.function.Function;
import java.util.function.Supplier;

import ejercicio04.product.Bike;
import ejercicio04.product.CountryBike;
import ejercicio04.product.Location;
import ejercicio04.product.RaceBike;
import ejercicio04.product.VespaBike;

public enum FactoryBike {
	VESPA((location) -> {
		return new VespaBike(location);
	}), 
	COUNTRY((location) -> {
		return new CountryBike(location);
	}), 
	RACE((location) -> {
		return new RaceBike(location);
	});
	private Function<Location,Bike> supplier;

	private FactoryBike(Function<Location,Bike> supplier) {
		this.supplier = supplier;
	}
	public Bike getBike(Location location) {
		return supplier.apply(location);
	}
}
