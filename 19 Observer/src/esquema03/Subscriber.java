package esquema03;

public interface Subscriber<T> {
	public void update(T context);
}
