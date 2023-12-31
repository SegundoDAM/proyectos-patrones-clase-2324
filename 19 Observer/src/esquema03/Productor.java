package esquema03;

import java.time.Duration;
import java.time.Instant;

public class Productor implements Runnable{
	private ConcretePublisher<StringBuilder> concretePublisher;
	private StringBuilder changingElement;
	
	
	public Productor(String changingElement) {
		super();
		this.changingElement = new StringBuilder(changingElement);
		this.concretePublisher = new ConcretePublisher<StringBuilder>(this.changingElement);
	}

	@Override
	public void run() {
		int index=0;
		do {
			this.changingElement.append(index);
			this.concretePublisher.notifySubscribers();
			Instant now = Instant.now();
			int times = 1000;
			Utiles.wasteTime(times);			
			System.out.println("element changed "+Duration.between(now,Instant.now()));
		}while(!jobDone());
	}

	private boolean jobDone() {
		return changingElement.length()>30;
	}

	public boolean subscribe(Subscriber subcriber) {
		return concretePublisher.subscribe(subcriber);
	}

	public boolean unsubscribe(Subscriber subscriber) {
		return concretePublisher.unsubscribe(subscriber);
	}
	
	
	
}
