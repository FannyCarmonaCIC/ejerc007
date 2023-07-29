package es.cic.ejerc007;

import java.util.ArrayList;
import java.util.List;

public class SalaDTO {
	
	private String pelicula;
	private List<SesionDTO> sesiones;
	private int numeroDeButacas;

	public SalaDTO() {
		sesiones = new ArrayList<SesionDTO>();
	}

	public String getPelicula() {
		return pelicula;
	}

	public int getButaca() {
		return numeroDeButacas;
	}

	public void setButaca(int butaca) {
		this.numeroDeButacas = butaca;
	}

	public List<SesionDTO> getSesiones() {
		return sesiones;
	}

	public void setSesiones(List<SesionDTO> sesiones) {
		this.sesiones = sesiones;
	}

	
}
