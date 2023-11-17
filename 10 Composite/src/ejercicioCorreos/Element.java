package ejercicioCorreos;

public class Element implements Operation {

	int value;
	
	
	public Element(int value) {
		super();
		this.value = value;
	}


	@Override
	public int sum() {
		return value;
	}

}
