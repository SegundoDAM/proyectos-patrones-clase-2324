package modelo.AbstractDAO;

import java.util.List;

import modelo.Entity.Pedido;
import modelo.Entity.Persona;

public interface PedidoDAO extends GenericDAO<Persona, Long> {
	public List<Pedido> findByPersona(Persona persona);
}
