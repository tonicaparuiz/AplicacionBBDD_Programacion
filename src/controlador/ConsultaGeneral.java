package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaGeneral {
	public void consultaGeneral() {
		ConexionMySql conexion = new ConexionMySql();
		Connection con = null;
		String instabla;
		try {
			Statement s = con.createStatement();
			instabla = "SELECT * FROM `city`";
			s.execute(instabla);
			System.out.println(s);
		} catch (SQLException e) {
			System.err.println("[Error al mostrar los datos]");
		} finally {
			conexion.desconectar(con);
		}

	}
}
