package modelo.ImplDAOJDBC;

import java.util.List;

import modelo.AbstractDAO.ReservaDAO;
import modelo.Entity.Reserva;
import modelo.acceso.AccessJdbc;

public class ReservaDAOJDBC implements ReservaDAO {

	private AccessJdbc accessJdbc;
	
	public ReservaDAOJDBC(AccessJdbc accessJdbc) {
		super();
		this.accessJdbc = accessJdbc;
	}

	@Override
	public List<Reserva> findByHotelID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reserva> findByClienteId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
