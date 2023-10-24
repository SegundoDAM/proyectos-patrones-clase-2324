
public class Singleton {
	private int cosa;
	private static Singleton INSTANCIA=new Singleton();

	private Singleton() {
		super();
	}

	public int getCosa() {
		return cosa;
	}

	public void setCosa(int cosa) {
		this.cosa = cosa;
	}

	public static Singleton getINSTANCIA() {
		return INSTANCIA;
	}
	
	
}
