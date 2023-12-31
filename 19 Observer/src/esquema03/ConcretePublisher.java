package esquema03;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConcretePublisher<T> implements Publisher<T> {

	private Set<Subscriber<T>> subscribers;
	private T element;

	public ConcretePublisher(T element) {
		this();
		this.element = element;
	}

	ConcretePublisher() {
		super();
		subscribers = new HashSet<Subscriber<T>>();
	}

	@Override
	public boolean subscribe(Subscriber<T> subcriber) {
		return subscribers.add(subcriber);

	}

	@Override
	public boolean unsubscribe(Subscriber<T> subscriber) {
		subscribers = subscribers.stream().filter((subs) -> {
			return !subs.equals(subscriber);
		}).collect(Collectors.toSet());
		return true;
	}

	@Override
	public void notifySubscribers() {
		subscribers.stream().forEach((subscriber) -> {
			subscriber.update(element);
		});

	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

}
