package cinemar.code;

public class Butaca {
	private String fila;
	private Integer numero;
	private Integer reservada;
	private Sala sala;

	public Butaca(String fila, Integer numero, Integer reservada, Sala sala) {
		super();
		this.fila = fila;
		this.numero = numero;
		this.reservada = reservada;
		this.sala = sala;
	}

	public String getFila() {
		return fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getReservada() {
		return reservada;
	}

	public void setReservada(Integer reservada) {
		this.reservada = reservada;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

}
