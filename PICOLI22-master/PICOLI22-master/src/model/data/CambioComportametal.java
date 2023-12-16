package model.data;

public class CambioComportametal {

	final EtapaVital etapaVital;
	final EdadObservable edadObservable;

	public CambioComportametal(EtapaVital etapaVital, EdadObservable edadObservable) {
		super();
		this.etapaVital = etapaVital;
		this.edadObservable = edadObservable;
	}

	public EtapaVital getEtapaVital() {
		return etapaVital;
	}

	public EdadObservable getEdadObservable() {
		return edadObservable;
	}

}
