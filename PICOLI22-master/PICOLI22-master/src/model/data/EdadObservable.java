package model.data;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Optional;

public abstract class EdadObservable {
	PropertyChangeListener listener;
	protected final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

	private void addPropertyChangeListener(PropertyChangeListener listener) {
		this.pcs.addPropertyChangeListener(listener);
	}

	private void removePropertyChangeListener(PropertyChangeListener listener) {
		this.pcs.removePropertyChangeListener(listener);
	}
	

	public EdadObservable(PropertyChangeListener listener) {
		super();
		this.listener=listener;
		addPropertyChangeListener(this.listener);
	}

	//Esto es lo especifico
	public abstract void aplicarEdad(int edad);
	public abstract Optional<EdadObservable> getEdadObservable();
}
