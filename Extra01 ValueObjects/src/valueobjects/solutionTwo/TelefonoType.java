package valueobjects.solutionTwo;

public class TelefonoType extends StringType {

	public TelefonoType(String value) throws Exception {
		super(value,"^[679]\\d{8}$");
		}
}
