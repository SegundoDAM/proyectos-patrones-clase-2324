package esquema03;

public interface Publisher<T> {
	public boolean subscribe(Subscriber<T> subscriber);
	public boolean unsubscribe(Subscriber<T> subscriber); 
	public void notifySubscribers();
}
