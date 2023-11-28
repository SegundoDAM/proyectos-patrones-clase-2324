package model.data;

import java.util.Objects;

public class Menor extends Ser {
	// si menor
	private float factorDesarrollo;

	public Menor(int necesidadVital) {
		super(necesidadVital);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(factorDesarrollo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menor other = (Menor) obj;
		return Float.floatToIntBits(factorDesarrollo) == Float.floatToIntBits(other.factorDesarrollo);
	}

}
