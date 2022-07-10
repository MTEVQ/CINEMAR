package cinemar.repository;

import java.sql.SQLException;

import cinemar.code.Descuento;

public class CRUDDescuento {
	private Conexion conexion;
	private String sql;
	
	public CRUDDescuento() {
		super();
		this.conexion = new Conexion("cinemar");
		this.conexion.connect();//Abre la conexion
		this.sql = "";
	}
	
	public void insertar(Descuento descuento) {//-->Registrar un descuento
		this.sql = "INSERT INTO descuento "+
				"(porcentaje, dia) "+
				"VALUE ('"+
				descuento.getPorcentaje()+"','"+
				descuento.getDia()+"')";
		try {
			conexion.getStmt().executeUpdate(this.sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Descuento registrado");
		}
	}
}