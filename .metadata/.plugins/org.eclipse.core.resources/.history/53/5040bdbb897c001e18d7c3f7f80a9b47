package valueobjects.solution;

public class TelefonoType {
	public String value;

	public TelefonoType(String value) throws Exception {
		super();
		this.value = value;
		String regex="^[679]\\d{8}$";
		if(!Utiles.testRegex(value, regex)) {
			throw new Exception();
		}
	}
}
