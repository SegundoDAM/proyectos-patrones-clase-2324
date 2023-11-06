package valueobjects.solutionTwo;

public class EmailType extends StringType{
	public String value;

	public EmailType(String value) throws Exception {
		super(value,"^[\\w.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]+$");
	}
}
