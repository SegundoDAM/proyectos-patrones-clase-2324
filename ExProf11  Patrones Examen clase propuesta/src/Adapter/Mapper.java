package Adapter;

public interface Mapper<T, S> {

	public T map(S s);
}
