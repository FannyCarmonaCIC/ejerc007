package es.cic.ejerc007;

public class SalaDTO {
	
	private PeliculaDTO pelicula;
	private SesionDTO sesion;
	private int butaca;

	public SalaDTO() {
	}

	public PeliculaDTO getPelicula() {
		return pelicula;
	}

	public void setPelicula(PeliculaDTO pelicula) {
		this.pelicula = pelicula;
	}

	public SesionDTO getSesion() {
		return sesion;
	}

	public void setSesion(SesionDTO sesion) {
		this.sesion = sesion;
	}

	public int getButaca() {
		return butaca;
	}

	public void setButaca(int butaca) {
		this.butaca = butaca;
	}

	
}
