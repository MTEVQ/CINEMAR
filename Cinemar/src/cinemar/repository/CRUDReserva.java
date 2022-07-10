package cinemar.repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import cinemar.code.Reserva;
import cinemar.code.Usuario;

public class CRUDReserva{
	private Conexion conexion;
	private String sql;
	
	public CRUDReserva() {
		super();
		this.conexion = new Conexion("cinemar");
		this.conexion.connect();//Abre la conexion
		this.sql = "";
	}
	
	@SuppressWarnings("deprecation")
	public boolean recibeDescuento(Usuario usuario) {
		boolean resultado = false;
		long fecha_actual = System.currentTimeMillis();
		Date fecha = new Date(fecha_actual);
		fecha.setMonth(fecha.getMonth()-3);
		this.sql = "SELECT COUNT(*) FROM reserva "+
				"WHERE reserva.id_usuario = "+
				usuario.getId()+
				" and reserva.fecha_compra >= '"+
				fecha+"'";
		try {
			ResultSet rs = null;
			rs = conexion.getStmt().executeQuery(sql);
			rs.next();
//			System.out.println(rs.getInt("count(*)"));
			if(rs.getInt("count(*)")>=6) {
				resultado = true;
			}else {
				resultado = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Recibe descuento:");
		}
		return resultado;
	}
	
	public void realizarReserva(Reserva reserva) {
		
	}
}