package es.cic.ejerc007;

public class SesionDTO {
	
	private final String sesion1 = "17h";
	private final String sesion2 = "20h";
	private final String sesion3 = "22h30";
	private SalaDTO sala;
	private int numeroDeButacasOcupadas;

	public SesionDTO() {
	}
	
	

	public String getSesion1() {
		return sesion1;
	}



	public String getSesion2() {
		return sesion2;
	}



	public String getSesion3() {
		return sesion3;
	}



	public SalaDTO getSala() {
		return sala;
	}



	public void setSala(SalaDTO sala) {
		this.sala = sala;
	}



	public int getNumeroDeButacasOcupadas() {
		return numeroDeButacasOcupadas;
	}

	public void setNumeroDeButacasOcupadas(int numeroDeButacasOcupadas) {
		this.numeroDeButacasOcupadas = numeroDeButacasOcupadas;
	}

}
