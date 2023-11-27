package esquema03;

public class ConcreteSubscriber<T> implements Subscriber<T>{

	T myElement;
	
	@Override
	public void update(T context) {
		//o cualquier cosa que quieras hacer
		myElement=context;
		
	}

}
