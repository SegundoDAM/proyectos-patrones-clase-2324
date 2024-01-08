package modelo;

import java.util.Optional;
import java.util.concurrent.SubmissionPublisher;

public class GpsService extends SubmissionPublisher<GeographicalPoint> implements Runnable {

	Optional<GeographicalPoint> previousGeographicalPoint=Optional.ofNullable(new GeographicalPoint(0,0,0));
	
	@Override
	public void run() {
		do {
			this.previousGeographicalPoint=Optional.of(new GeographicalPointOM()
					.getGeographicalPointRelated(
							previousGeographicalPoint.get()));
			System.out.println("sendin point");
			submit(this.previousGeographicalPoint.get());
			try {
				int millis = 2000;
				Thread.currentThread().sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}while(true);
	}

}
