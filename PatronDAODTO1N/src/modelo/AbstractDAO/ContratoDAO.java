package modelo.AbstractDAO;

import modelo.Entity.Contrato;
import modelo.Entity.Persona;

public interface ContratoDAO extends GenericDAO<Contrato, Long> {
	//intenta desarrollar esto y explica los problemas que le ves
	public Persona findPersonaByContrato(Long idContrato);
}
