package modelo.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class ReservaResponseDTO {

	private String nombreCliente;
	private Map<String, List<LocalDate>> reservas;
	
	public ReservaResponseDTO(String nombreCliente, Map<String, List<LocalDate>> reservas) {
		super();
		this.nombreCliente = nombreCliente;
		this.reservas = reservas;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public Map<String, List<LocalDate>> getReservas() {
		return reservas;
	}

	public void setReservas(Map<String, List<LocalDate>> reservas) {
		this.reservas = reservas;
	}
	
	
}
