package modelo.ImplDAOJDBC;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import control.services.GestionReservasService;
import modelo.Entity.Persona;
import modelo.Entity.Reserva;
import modelo.dto.ReservaResponseDTO;

public class GestionReservasServiceJDBCImpl implements GestionReservasService {
	private PersonaDAOJdbc personaDAOJdbc;
	private ReservaDAOJDBC reservaDAOJDBC;
	private HotelDAOJDBC hotelDAOJDBC;

	public GestionReservasServiceJDBCImpl(PersonaDAOJdbc personaDAOJdbc, ReservaDAOJDBC reservaDAOJDBC,
			HotelDAOJDBC hotelDAOJDBC) {
		super();
		this.personaDAOJdbc = personaDAOJdbc;
		this.reservaDAOJDBC = reservaDAOJDBC;
		this.hotelDAOJDBC = hotelDAOJDBC;
	}

	@Override
	public ReservaResponseDTO getReservas(Long idPersona) {
		Persona findById = personaDAOJdbc.findById(idPersona);
		return new ReservaResponseDTO(findById.getNombre(),
				reservaDAOJDBC.findByClienteId(idPersona).stream()
						.collect(Collectors.groupingBy(
								reserva -> hotelDAOJDBC.findById(reserva.getIdHotel()).getNombre(),
								Collectors.mapping(Reserva::getFecha, Collectors.toList()))));
	}

	public ReservaResponseDTO getReservasjava6(Long idPersona) {
		// obtengo las reservas del cliente
		List<Reserva> reservas = reservaDAOJDBC.findByClienteId(idPersona);
		// Creo el mapa
		HashMap<Long, List<LocalDate>> conversion = new HashMap<>();
		for (Reserva reserva : reservas) {
			conversion.put(reserva.getIdHotel(), new ArrayList<LocalDate>());
		}
		// vuelvo a recorrer para rellenar la lista
		Set<Entry<Long, List<LocalDate>>> entrySet = conversion.entrySet();
		for (Entry<Long, List<LocalDate>> entry : entrySet) {
			for (Reserva reserva : reservas) {
				if (reserva.getIdHotel() == entry.getKey()) {
					entry.getValue().add(reserva.getFecha());
				}
			}
		}
//		convierto las referencias de hoteles a su nombre
		HashMap<String, List<LocalDate>> reservasFinales = new HashMap<String, List<LocalDate>>();
		for (Entry<Long, List<LocalDate>> entry : entrySet) {
			reservasFinales.put(hotelDAOJDBC.findById(entry.getKey()).getNombre(), entry.getValue());
		}
		return new ReservaResponseDTO(personaDAOJdbc.findById(idPersona).getNombre(), reservasFinales);
	}
}
