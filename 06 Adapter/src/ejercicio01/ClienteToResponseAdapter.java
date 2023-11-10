package ejercicio01;

import java.util.List;
import java.util.stream.Collectors;

public class ClienteToResponseAdapter {

	private String adapt(Cliente cliente) {
		return cliente.getNombre() + " " + cliente.getCuenta().getSaldo();
	}

	public String[] convert(List<Cliente> clientes) {
		return clientes.stream()
				.map((cliente) -> {
					return adapt(cliente);
					})
				.toArray(String[]::new);
	}
}
