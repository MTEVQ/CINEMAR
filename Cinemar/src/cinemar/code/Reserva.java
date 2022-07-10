package cinemar.code;

import java.sql.Date;

public class Reserva {
	
	private Float precio;
	private Date fecha_compra;
	private Sesion sesion;
	private Butaca butaca;
	private Usuario usuario;
	private TarjetaCredito medioPago;
	private Descuento descuento;
	
	public Reserva(Float precio, Date fecha_compra, Sesion sesion, Butaca butaca, Usuario usuario,
			TarjetaCredito medioPago, Descuento descuento) {
		super();
		this.precio = precio;
		this.fecha_compra = fecha_compra;
		this.sesion = sesion;
		this.butaca = butaca;
		this.usuario = usuario;
		this.medioPago = medioPago;
		this.descuento = descuento;
	}

	public Butaca getButaca() {
		return butaca;
	}

	public void setButaca(Butaca butaca) {
		this.butaca = butaca;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Descuento getDescuento() {
		return descuento;
	}

	public void setDescuento(Descuento descuento) {
		this.descuento = descuento;
	}

	public Sesion getSesion() {
		return sesion;
	}

	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}

	public TarjetaCredito getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(TarjetaCredito medioPago) {
		this.medioPago = medioPago;
	}

	public Date getFecha_compra() {
		return fecha_compra;
	}

	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}
	
}
