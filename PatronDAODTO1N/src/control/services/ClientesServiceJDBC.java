package control.services;

import modelo.AbstractDAO.ContratoDAO;
import modelo.AbstractDAO.PersonaDAO;
import modelo.Entity.Persona;

public class ClientesServiceJDBC implements ClientesService{
	private PersonaDAO personaDAO;
	private ContratoDAO contratoDAO;
	
	public ClientesServiceJDBC(PersonaDAO personaDAO, ContratoDAO contratoDAO) {
		super();
		this.personaDAO = personaDAO;
		this.contratoDAO = contratoDAO;
	}

	@Override
	public Persona getPersonaByContrato(Long contratoId) {
		return personaDAO.findById(contratoDAO.findById(contratoId).getPersonaID());
	}
	
	
}
