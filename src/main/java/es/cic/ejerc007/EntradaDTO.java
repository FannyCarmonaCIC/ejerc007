package es.cic.ejerc007;

public class EntradaDTO {
	
	private int id;
	private SalaDTO sala;
	private SesionDTO sesion;
	private PeliculaDTO pelicula;
	private final int precio = 5;
	private int totalDeEntradas;

	public EntradaDTO() {	

	}
	
	public EntradaDTO(SalaDTO sala, SesionDTO sesion, PeliculaDTO pelicula, int totalDeEntradas) {
		this.sala = sala;
		this.sesion = sesion;
		this.pelicula = pelicula;
		this.totalDeEntradas = totalDeEntradas;
	}

	public int getId() {
		return id;
	}

	public SalaDTO getSala() {
		return sala;
	}

	public void setSala(SalaDTO sala) {
		this.sala = sala;
	}

	public SesionDTO getSesion() {
		return sesion;
	}

	public void setSesion(SesionDTO sesion) {
		this.sesion = sesion;
	}

	public PeliculaDTO getPelicula() {
		return pelicula;
	}

	public void setPelicula(PeliculaDTO pelicula) {
		this.pelicula = pelicula;
	}

	public int getTotalDeEntradas() {
		return totalDeEntradas;
	}

	public void setTotalDeEntradas(int totalDeEntradas) {
		this.totalDeEntradas = totalDeEntradas;
	}
	
	

}
