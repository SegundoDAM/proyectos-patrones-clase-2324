package valueobjects.solution;

public class DNIType {
	public String value;

	public DNIType(String dNI) throws Exception {
		super();
		value = dNI;
		String regex="^(?![AEIOU])[0-9]{7}[0-9A-HJ-NP-TV-Z]$";
		if(!Utiles.testRegex(dNI, regex)) {
			throw new Exception();
		}
	}
}
