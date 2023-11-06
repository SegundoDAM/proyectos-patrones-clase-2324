package valueobjects.problem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {

	private String DNI,email,telefono;

	public Persona(String dNI, String email, String telefono) throws Exception {
		super();
		setDNI(dNI);;
		setEmail(email);
		setTelefono(telefono);
	}
	
	private boolean testRegex(String value, String regex) {
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(value);
		return matcher.matches();
	}

	private void setDNI(String dNI) throws Exception {
		String regex="^(?![AEIOU])[0-9]{7}[0-9A-HJ-NP-TV-Z]$";
		if(!testRegex(dNI, regex)) {
			throw new Exception();
		}
		DNI = dNI;
	}

	private void setEmail(String email) throws Exception {
		String regex="^[\\w.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]+$";
		if(!testRegex(email, regex))
			throw new Exception();
		this.email = email;
	}

	private void setTelefono(String telefono) throws Exception {
		String regex="^[679]\\d{8}$";
		if(!testRegex(telefono, regex))
			throw new Exception();
		this.telefono = telefono;
	}
	
	public final String getDNI() {
		return DNI;
	}

	public final String getEmail() {
		return email;
	}

	public final String getTelefono() {
		return telefono;
	}

	
	
	
}
