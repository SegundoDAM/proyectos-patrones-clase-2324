package valueobjects.solution;

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
