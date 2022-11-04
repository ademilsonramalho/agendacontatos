package br.com.cotiinformatica.factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	private static final String DRIVER = "org.postgresql.Driver";
	private static final String HOST = "jdbc:postgresql://localhost:5051/bd_agendacontatos";
	private static final String USER = "postgres";
	private static final String PASS = "coti";

	public static Connection createConnection() throws Exception {
		
		Class.forName(DRIVER);
		return DriverManager.getConnection(HOST, USER, PASS);
		
	}
}
