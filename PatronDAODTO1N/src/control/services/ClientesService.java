package control.services;

import modelo.Entity.Contrato;
import modelo.Entity.Persona;

public interface ClientesService {
	public Persona getPersonaByContrato(Long contratoId);
}
