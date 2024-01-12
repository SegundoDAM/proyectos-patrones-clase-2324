package modelo.ImplDAOJDBC;

import java.util.Collection;

import modelo.AbstractDAO.HotelDAO;
import modelo.Entity.Hotel;
import modelo.acceso.AccessJdbc;

public class HotelDAOJDBC implements HotelDAO{
	AccessJdbc accessJdbc;
	
	public HotelDAOJDBC(AccessJdbc accessJdbc) {
		super();
		this.accessJdbc = accessJdbc;
	}

	@Override
	public void create(Hotel entidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Hotel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hotel findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
