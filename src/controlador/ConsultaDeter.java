package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaDeter {
	
	private static String seleccion = "SELECT * FROM `city` WHERE ID = ?";

	public void selectorCiudad(int idCiudad) {
		ConexionMySql conexion = new ConexionMySql();
		Connection con = null;
		try {

			con = conexion.conectar();

			PreparedStatement pre = con.prepareStatement(seleccion);
			pre.setInt(1, idCiudad);

			ResultSet rs = pre.executeQuery();

			while (rs.next()) {

				System.out.println(rs.getInt(1));

				if (Integer.parseInt(rs.getString("ID")) == idCiudad) {
					System.out.println(rs.getInt("ID"));
					System.out.println(rs.getString("Name"));
				}

			}

		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}

	}
	
}
