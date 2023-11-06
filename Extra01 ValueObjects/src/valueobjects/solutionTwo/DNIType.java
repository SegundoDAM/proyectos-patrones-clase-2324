package valueobjects.solutionTwo;

public class DNIType extends StringType{

	public DNIType(String dNI) throws Exception {
		super(dNI,"^(?![AEIOU])[0-9]{7}[0-9A-HJ-NP-TV-Z]$");
	}
}
