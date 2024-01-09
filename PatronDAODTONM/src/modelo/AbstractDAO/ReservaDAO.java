package modelo.AbstractDAO;

import java.util.List;

import modelo.Entity.Reserva;

public interface ReservaDAO {
	public List<Reserva> findByHotelID(Long id);
	public List<Reserva> findByClienteId(Long id);
	
}
