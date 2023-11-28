package model.data;

import java.util.Objects;

public class Adulto extends Ser {
	// si adulto
	private long ahorro;
	private boolean activo;

	public Adulto(Ser ser) {
		super(ser);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(activo, ahorro);
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
		Adulto other = (Adulto) obj;
		return activo == other.activo && ahorro == other.ahorro;
	}

}
