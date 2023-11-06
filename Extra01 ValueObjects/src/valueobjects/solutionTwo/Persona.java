package valueobjects.solutionTwo;

//Es un valuetype porque no tiene setters
public class Persona {

	private DNIType DNI;
	private EmailType email;
	private TelefonoType telefono;

	public Persona(String dNI, String email, String telefono) throws Exception {
		super();
		this.DNI=new DNIType(dNI);
		this.email=new EmailType(email);
		this.telefono=new TelefonoType(telefono);
	}
	
		
	public void setDNI(String dni) throws Exception {
		this.DNI=new DNIType(dni);
	}
	
	public final String getDNI() {
		return DNI.value;
	}

	public final String getEmail() {
		return email.value;
	}

	public final String getTelefono() {
		return telefono.value;
	}
	
}
