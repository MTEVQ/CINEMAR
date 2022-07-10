package cinemar.repository;

import java.sql.SQLException;

import cinemar.code.Butaca;

public class CRUDButaca {
	private Conexion conexion;
	private String sql;
	
	public CRUDButaca() {
		super();
		this.conexion = new Conexion("cinemar");
		this.conexion.connect();//Abre la conexion
		this.sql = "";
	}
	
	public void insertar(Butaca butaca) {//-->Registrar un usuario
		this.sql = "INSERT INTO butaca "+
				"(fila, numero, reservada, id_sala) "+
				"VALUE ('"+
				butaca.getFila()+"','"+
				butaca.getNumero()+"','"+
				butaca.getReservada()+"','"+
				butaca.getSala()+"')";
		try {
			conexion.getStmt().executeUpdate(this.sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Butaca registrada");
		}
	}
}