package modelo.ImplDAOJDBC;

import java.sql.SQLException;

import modelo.AbstractDAO.DaoFactory;
import modelo.AbstractDAO.HotelDAO;
import modelo.AbstractDAO.PersonaDAO;
import modelo.AbstractDAO.ReservaDAO;
import modelo.acceso.AccessJdbc;

public class DAOFactoryJDBC extends DaoFactory {
	AccessJdbc accessJdbc;
	

	public DAOFactoryJDBC() throws ClassNotFoundException, SQLException {
		super();
		//EStos parametros pueden ser pasado por parametros o configurados en otro sitio
		accessJdbc=new AccessJdbc("ejemplo", "root", "");
	}



	@Override
	public PersonaDAO getPersonaDAO() {
		return new PersonaDAOJdbc(accessJdbc);
	}



	@Override
	public HotelDAO getHotelDAO() {
		return new HotelDAOJDBC(accessJdbc);
	}



	@Override
	public ReservaDAO getReservaDAO() {
		return new ReservaDAOJDBC(accessJdbc);
	}



	public AccessJdbc getAccessJDBC() {
		return accessJdbc;
	}

}
