package control.services;

import modelo.dto.ReservaResponseDTO;

public interface GestionReservasService {

	public ReservaResponseDTO getReservas(Long idPerson);
}
