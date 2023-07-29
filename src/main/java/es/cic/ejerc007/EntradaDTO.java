package es.cic.ejerc007;

public class EntradaDTO {
	
	private int id;
	private SalaDTO sala;
	private SesionDTO sesion;
	private String pelicula;
	private final int precio = 5;
	private int totalDeEntradas;

	public EntradaDTO(int id, SalaDTO sala, SesionDTO sesion, String pelicula, int totalDeEntradas) {
		this.sala = sala;
		this.sesion = sesion;
		this.pelicula = pelicula;
		this.totalDeEntradas = totalDeEntradas;
	}
	

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}
	
	public int getPrecio() {
		return precio;
	}

	public int getTotalDeEntradas() {
		return totalDeEntradas;
	}

	public void setTotalDeEntradas(int totalDeEntradas) {
		this.totalDeEntradas = totalDeEntradas;
	}
	
	

}
