package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySql {

	public Connection conectar() {

		Connection con = null;

		try {

			// Abrimos la conexion
			con = DriverManager.getConnection("jdbc:mysql://localhost/world", "root", "");

			// Comprobamos que se ha creado correctamente
			if (con != null) {
				System.out.println("[Conectado]");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}

	public void desconectar(Connection con) {
		try {
			con.close();
			System.out.println("[Desconectado]");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
