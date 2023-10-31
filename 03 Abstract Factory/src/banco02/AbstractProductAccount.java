package banco02;

public abstract class AbstractProductAccount implements Showable {

	public float comission;
	
	public AbstractProductAccount(float comission) {
		super();
		this.comission = comission;
	}

}
