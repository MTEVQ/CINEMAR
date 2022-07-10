package cinemar.code;

public class Clasificacion {
	private String identificador;
	private String descripcion;
	private String recomendacion;
	
	public Clasificacion(String identificador, String recomendacion, String descripcion) {
		super();
		this.identificador = identificador;
		this.recomendacion = recomendacion;
		this.descripcion = descripcion;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getRecomendacion() {
		return recomendacion;
	}

	public void setRecomendacion(String recomendacion) {
		this.recomendacion = recomendacion;
	}
	
	
	
}
