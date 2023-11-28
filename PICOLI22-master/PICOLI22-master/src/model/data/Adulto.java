package model.data;

import java.util.Objects;

public class Adulto implements EtapaVital{
	// si adulto
	private long ahorro;
	private boolean activo;
	
	@Override
	public void alimentar(int sueldo) {
		System.out.println("que horror soy adulto");
		
	}

}
