package com.roadofdreams.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.roadofdreams.model.Contato;

public class ContatoDAO {

    private static String sql;

	private final Connection connection;

	public ContatoDAO(Connection connection) {
		this.connection = connection;
	}

//CREATE
	
	public void createContato (Contato contato) {
		sql = "INSERT INTO contato (nomeContato, emailContato, assuntoContato, telefoneContato, mensagemContato) VALUES (?,?,?,?,?)";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, contato.getNomeContato());
			stmt.setString(2, contato.getEmailContato());
			stmt.setString(3, contato.getAssuntoContato());
			stmt.setString(4, contato.getTelefoneContato());
			stmt.setString(5, contato.getMensagemContato());
			
			stmt.executeUpdate();
			System.out.println("Contato enviado com sucesso!" );
		}catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}
	}


	// READ
		public void readAllClients() {
			sql = "SELECT * FROM contato";
			try (PreparedStatement stmt = connection.prepareStatement(sql)) {
				ResultSet r = stmt.executeQuery();
				while (r.next()) {
					Contato contato = new Contato();
					contato.setIdContato(r.getInt("idContato"));
					contato.setNomeContato(r.getString("nomeContato"));
					contato.setEmailContato(r.getString("emailContato"));
					contato.setAssuntoContato(r.getString("assuntoContato"));
					contato.setTelefoneContato(r.getString("telefoneContato"));
					contato.setMensagemContato(r.getString("MensagemContato"));

					System.out.printf("ID: %d\n Nome: %s\n Email: %s\n Assunto: %s\n , Mensagem: %s\\n", contato.getIdContato(),
							contato.getNomeContato(), contato.getEmailContato(), contato.getAssuntoContato(),
							contato.getTelefoneContato(), contato.getMensagemContato());

				}
				if (!r.next()) {
					System.out.println( "NÃO Há DADOS" );
				}

			} catch (SQLException e) {
				System.out.println( "[LOG] Não foi possível acessar as informações." 
						+ "Mensagem: " + e.getMessage());
			}
		}


		
		// UPDATE
		public void updateClient(Contato contato) {
			sql = "UPDATE contato SET nomeContato = ?, emailContato = ?, assuntoContato = ?, telefone = ?, mensagemContato = ? WHERE idContato = ?";
			try (PreparedStatement stmt = connection.prepareStatement(sql)) {
				stmt.setString(1, contato.getNomeContato());
				stmt.setString(2, contato.getEmailContato());
				stmt.setString(3, contato.getAssuntoContato());
				stmt.setString(4, contato.getTelefoneContato());
				stmt.setString(5, contato.getMensagemContato());
				

				stmt.executeUpdate();
				System.out.println( "Mensagem atualizada com sucesso\n" );

			} catch (SQLException e) {
				System.out.println( "[LOG] Não foi possível atualizar a mensagem." 
						+ "Mensagem: " + e.getMessage());
			}
		}

		// DELETE
		public void deleteContato(int idContato) {
			sql = "DELETE FROM contato WHERE idContato = ?";
			try (PreparedStatement stmt = connection.prepareStatement(sql)) {
				stmt.setInt(1, idContato);

				stmt.executeUpdate();
				System.out.println( "Assunto deletado com sucesso!" );
			} catch (SQLException e) {
				System.out.println( "Não foi possível deletar a mensagem." 
						+ "Mensagem: " + e.getMessage());
			}
		}


}