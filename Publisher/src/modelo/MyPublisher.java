package modelo;

import java.util.concurrent.SubmissionPublisher;

public class MyPublisher extends SubmissionPublisher<GeographicalPoint> {

	public void doSomething() {
		submit(new GeographicalPoint(0, 0, 0));
	}
}
