package cinemar.repository;

import java.sql.SQLException;

import cinemar.code.Clasificacion;

public class CRUDClasificacion {
	private Conexion conexion;
	private String sql;
	
	public CRUDClasificacion() {
		super();
		this.conexion = new Conexion("cinemar");
		this.conexion.connect();//Abre la conexion
		this.sql = "";
	}
	
	public void insertar(Clasificacion clasificacion) {//-->Registrar un usuario
		this.sql = "INSERT INTO clasificacion "+
				"(identificador, recomendacion, descripcion) "+
				"VALUE ('"+
				clasificacion.getIdentificador()+"','"+
				clasificacion.getRecomendacion()+"','"+
				clasificacion.getDescripcion()+"')";
		try {
			conexion.getStmt().executeUpdate(this.sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Clasificación registrada");
		}
	}
}