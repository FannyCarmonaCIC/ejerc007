package es.cic.ejerc007;

public class EntradaDTO {
	
	private int id;
	private SesionDTO sesion;
	private String pelicula;
	private final int precio = 5;
	private int totalDeEntradas;
	private double totalPagado;

	public EntradaDTO(int id, SesionDTO sesion, String pelicula, int totalDeEntradas) {
		this.id = id;
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


	public double getTotalPagado() {
		return totalPagado;
	}


	public void setTotalPagado(double totalPagado) {
		this.totalPagado = totalPagado;
	}
	

}
