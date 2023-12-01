package model.data;

import java.beans.PropertyChangeListener;
import java.util.Optional;

public class MenorObservable extends EdadObservable {

	public MenorObservable(PropertyChangeListener listener) {
		super(listener);
	}

	@Override
	public void aplicarEdad(int edad) {
		if (edad == 18) {
			pcs.firePropertyChange("Adulto", null, new Adulto());
		}

	}

	@Override
	public Optional<EdadObservable> getEdadObservable() {
		return Optional.of(new AdultoObservable(this.listener));
	}

}
