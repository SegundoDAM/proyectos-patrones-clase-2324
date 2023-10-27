package ejerciciohabitacion0424;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public enum Type {
	Wall(() -> {
		return new Wall();
	}), Door(() -> {
		return new Door();
	}), Window(() -> {
		return new Ventana();
	});

	private Supplier<Side> supplier;

	private Type(Supplier<Side> supplier) {
		this.supplier = supplier;
	}

	public Supplier<Side> getSupplier() {
		return supplier;
	}

	public static Side getRandom() {
		int length = Type.values().length;
		int nextInt = Utils.getRandomInt(length);
		return getSide(Type.values()[nextInt]);

	}

	public static Type getRandomNoDoor() {
		List<Type> sides = List.of(Wall, Window);
		return sides.get(new Random().nextInt(sides.size()));
	}

	public static Side getSide(Type tipo) {
		return tipo.getSupplier().get();
	}

	public static Side getRandomSideNoDoor() {
		return Type.getSide(Type.getRandomNoDoor());
	}
}
