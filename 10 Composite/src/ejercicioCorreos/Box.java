package ejercicioCorreos;

import java.util.List;

import solucion.TreeNumber;

public class Box implements Operation {

	List<Operation> box;

	public Box(List<Operation> box) {
		super();
		this.box = box;
	}

	@Override
	public int sum() {
		return box.stream().mapToInt(Operation::sum).sum();
	}
	
	
}
