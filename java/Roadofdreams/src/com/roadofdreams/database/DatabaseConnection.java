package com.roadofdreams.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {

	private static final String url = "jdbc:mysql://localhost:3306/agencia";

	private static final String user = "root";

	private static final String password = "2707";

	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Encontrado!");

		} catch (ClassNotFoundException e) {
			System.out.println("Driver não encontrado! Mensagem: " + e.getMessage());
		}

		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Conectado com sucesso!");

			return connection;
		} catch (SQLException e) {
			System.out.println("Não foi possível conectar ao banco! Mensagem: " + e.getMessage());
			return null;
		}

	}
}
