package cinemar.repository;

import java.sql.SQLException;

import cinemar.code.TipoPelicula;

public class CRUDTipoPelicula{
	private Conexion conexion;
	private String sql;
	
	public CRUDTipoPelicula() {
		super();
		this.conexion = new Conexion("cinemar");
		this.conexion.connect();//Abre la conexion
		this.sql = "";
	}
	
	public void insertar(TipoPelicula tipopelicula) {//-->Registrar un Tipo de Película
		this.sql = "INSERT INTO tipopelicula "+
				"(formato, idioma, subtitulada) "+
				"VALUE ('"+
				tipopelicula.getFormato()+"','"+
				tipopelicula.getIdioma()+"','"+
				tipopelicula.getSubtitulada()+"')";
		try {
			conexion.getStmt().executeUpdate(this.sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Tipo de Película registrada");
		}
	}
}