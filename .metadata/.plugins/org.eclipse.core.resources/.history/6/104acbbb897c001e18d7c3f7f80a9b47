package valueobjects.solution;

public class EmailType {
	public String value;

	public EmailType(String value) throws Exception {
		super();
		this.value = value;
		String regex="^[\\w.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]+$";
		if(!Utiles.testRegex(value, regex)) {
			throw new Exception();
		}
	}
	
	
}
