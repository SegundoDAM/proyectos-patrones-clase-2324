package valueobjects.solutionTwo;

public class StringType {
	public String value;

	public StringType(String value,String regex) throws Exception {
		super();
		this.value = value;
		if(!Utiles.testRegex(value, regex)) {
			throw new Exception();
		}
	}
	
}
