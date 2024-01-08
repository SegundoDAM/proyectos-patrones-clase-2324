package myAcceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) {
		String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
		String URL_BASEDATOS = "jdbc:mysql://localhost:3306/ejemplo";

		try {
			Class.forName(CONTROLADOR);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(URL_BASEDATOS, "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ya ");

		ResultSet conjuntoResultados = null;
		Statement instruccion = null;
		try {
			instruccion = conexion.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conjuntoResultados = instruccion.executeQuery("SELECT * FROM persona");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("con consulta");
		ResultSetMetaData metaDatos = null;
		try {
			metaDatos = conjuntoResultados.getMetaData();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int numeroDeColumnas = 0;
		try {
			numeroDeColumnas = metaDatos.getColumnCount();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("resultados");
		for (int i = 1; i <= numeroDeColumnas; i++)
			try {
				System.out.printf("%-8s\t", metaDatos.getColumnName(i));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

		try {
			System.out.println();
			while (conjuntoResultados.next()) {
				for (int i = 1; i <= numeroDeColumnas; i++)
					System.out.printf("%-8s\t", conjuntoResultados.getObject(i));
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
