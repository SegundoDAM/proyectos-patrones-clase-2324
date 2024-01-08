package modelo;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class GPSSubscriber implements Subscriber<GeographicalPoint> {

	private Subscription subscription;
	
	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription=subscription;
		this.subscription.request(1);
	}

	@Override
	public void onNext(GeographicalPoint item) {
		subscription.request(1);
		System.out.println(item.toString());
	}

	@Override
	public void onError(Throwable throwable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onComplete() {
		// TODO Auto-generated method stub
		
	}
	
}
