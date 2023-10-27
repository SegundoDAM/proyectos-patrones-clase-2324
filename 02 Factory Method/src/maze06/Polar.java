package maze06;

import java.util.Arrays;
import java.util.List;

public enum Polar {
	North, East, South, West;

	public static Polar getOppositePolar(Polar polar) {
		switch (polar) {
		case North:
			return South;
		case South:
			return North;
		case West:
			return East;
		case East:
			return West;
		default:
			return North;
		}
		// List<Polar> asList = Arrays.asList(Polar.values());
		// int index = (asList.indexOf(polar)+2)%4;
		// return asList.get(index);
	}

	public static Polar getLeftPolarRandom(Polar... forbiddenPolars) {
		Polar[] entranceDoor2 = forbiddenPolars;
		Polar[] avalaiblePolars = Polar.values();
//		restingPolars=avalaiblePolars-forbiddenPolars;
		return null;
	}
}
