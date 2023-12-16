package modelo;

import java.util.Objects;

public class Par<S, R> {
	private S first;
	private R second;
	public Par(S first, R second) {
		super();
		this.first = first;
		this.second = second;
	}
	public S getFirst() {
		return first;
	}
	private void setFirst(S first) {
		this.first = first;
	}
	public R getSecond() {
		return second;
	}
	private void setSecond(R second) {
		this.second = second;
	}
	@Override
	public int hashCode() {
		return Objects.hash(first, second);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Par other = (Par) obj;
		return Objects.equals(first, other.first) && Objects.equals(second, other.second);
	}
	
	
}
