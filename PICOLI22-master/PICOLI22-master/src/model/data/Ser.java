package model.data;

import utiles.Utiles;

public class Ser {
	private static final int vidaMax = 120;
	private static final int vidaMin = 0;
	private static final int edadAdulto = 18;
	protected static final int edadAnciano = 65;

	protected float esperanzaVida;
	protected int edad = 0;
	protected int necesidadVital;

	// si menor
	private float factorDesarrollo;

	// si adulto
	private long ahorro;
	private boolean activo;

	public Ser(int necesidadVital) {
		super();
		esperanzaVida = calculaEsperanzaVida(vidaMin, vidaMax);
		this.necesidadVital = necesidadVital;
	}

	// envejecer es igual para todo, esto no cambia
	public void envejecer() {
		edad++;
	}

	public float getEsperanzaVida() {
		return esperanzaVida;
	}

	public void setEsperanzaVida(float esperanzaVida) {
		this.esperanzaVida = esperanzaVida;
	}

	private int calculaEsperanzaVida(int minimo, int maximo) {
		return Utiles.dameNumero(maximo);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isAlive() {
		return this.edad <= this.esperanzaVida;
	}

	public void vivir(int sueldo) {
		this.alimentar(sueldo);
		this.recalcularEsperanzaDeVida(sueldo);
	}

	protected void recalcularEsperanzaDeVida(int sueldo) {
		if (isMenor())
			recalcularEsperanzaDeVidaMenor(sueldo);
		if (isAdulto())
			recalcularEsperanzaDeVidaAdulto(sueldo);
		if (isAnciano())
			recalcularEsperanzaDeVidaAnciano(sueldo);
	}

	private void recalcularEsperanzaDeVidaAnciano(int sueldo) {
		// TODO Auto-generated method stub

	}

	private void recalcularEsperanzaDeVidaAdulto(int sueldo) {
		// TODO Auto-generated method stub

	}

	private void recalcularEsperanzaDeVidaMenor(int sueldo) {
		// TODO Auto-generated method stub

	}

	public void alimentar(int sueldo) {
		if (isMenor())
			alimentarMenor(sueldo);
		if (isAdulto())
			alimentarAdulto(sueldo);
		if (isAnciano())
			alimentarAnciano(sueldo);
	}

	private void alimentarAnciano(int sueldo) {
		System.out.println("anciano");

	}

	private void alimentarAdulto(int sueldo) {
		System.out.println("adulto");

	}

	private void alimentarMenor(int sueldo) {
		System.out.println("menor");

	}

	public boolean isAnciano() {
		return edad >= 65;
	}

	public boolean isAdulto() {
		return !isMenor() && !isAnciano();
	}

	public boolean isMenor() {
		return edad < 18;
	}

}
