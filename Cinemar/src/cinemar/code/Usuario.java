package cinemar.code;

import java.sql.Date;

public class Usuario {
	private Integer id;
	private String nombre;
	private String apellido;
	private String email;
	private Integer dni;
	private Date fecha_nac;
	private String contrasenia;
	
	public Usuario(String nombre, String apellido, String email, Integer dni, Date fecha_nac, String contrasenia) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.dni = dni;
		this.fecha_nac = fecha_nac;
		this.contrasenia = contrasenia;
	}
	
	public Usuario(Integer id, String nombre, String apellido, String email, Integer dni, Date fecha_nac, String contrasenia) {
		super();
		this.id= id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.dni = dni;
		this.fecha_nac = fecha_nac;
		this.contrasenia = contrasenia;
	}
		
	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
}
