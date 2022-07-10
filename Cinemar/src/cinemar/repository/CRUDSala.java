package cinemar.repository;

import java.sql.SQLException;

import cinemar.code.Sala;

public class CRUDSala {
	private Conexion conexion;
	private String sql;
	
	public CRUDSala() {
		super();
		this.conexion = new Conexion("cinemar");
		this.conexion.connect();//Abre la conexion
		this.sql = "";
	}
	
	public void insertar(Sala sala) {//-->Insertar una sala
		this.sql = "INSERT INTO sala "+
				"(numero, formato, capacidad) "+
				"VALUE ('"+
				sala.getNumero()+"','"+
				sala.getFormato()+"','"+
				sala.getCapacidad()+"')";
		try {
			conexion.getStmt().executeUpdate(this.sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Sala registrada");
		}
	}
}