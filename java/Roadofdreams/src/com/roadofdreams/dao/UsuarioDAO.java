package com.roadofdreams.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.roadofdreams.model.Usuario;

public class UsuarioDAO {

	private static String sql;

	private final Connection connection;

	public UsuarioDAO(Connection connection) {
		this.connection = connection;
	}

//CREATE

	public void createUsuario(Usuario usuario) {
		sql = "INSERT INTO usuario(nomeUsuario, sobrenomeUsuario, emailUsuario, celularUsuario, generoUsuario, senhaUsuario ) VALUES(?,?,?,?,?,?) ";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, usuario.getNomeUsuario());
			stmt.setString(2, usuario.getSobrenomeUsuario());
			stmt.setString(3, usuario.getEmailUsuario());
			stmt.setString(4, usuario.getCelularUsuario());
			stmt.setString(5, usuario.getGeneroUsuario());
			stmt.setString(6, usuario.getSenhaUsuario());

			stmt.executeUpdate();
			System.out.println("Usuário criado com sucesso! " + usuario.getNomeUsuario() + usuario.getSobrenomeUsuario());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

//READ
	
	public void readAllClients() {
		sql = "SELECT * FROM usuario";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			ResultSet r = stmt.executeQuery();
			while (r.next()) {
				Usuario usuario = new Usuario();
				usuario.setIdUsuario(r.getInt("idUsuario"));
				usuario.setNomeUsuario(r.getString("nomeUsuario"));
				usuario.setSobrenomeUsuario(r.getString("sobrenomeUsuario"));
				usuario.setEmailUsuario(r.getString("emailUsuario"));
				usuario.setCelularUsuario(r.getString("celularUsuario"));
				usuario.setGeneroUsuario(r.getString("GeneroUsuario"));
				usuario.setSenhaUsuario(r.getString("SenhaUsuario"));
				System.out.printf("ID: %d\n Nome: %s\n Sobrenome: %s\n Email: %s\n Celular: %s\n Gênero: %s\n Senha:$s\n", usuario.getIdUsuario(),
						usuario.getNomeUsuario(), usuario.getSobrenomeUsuario(), usuario.getEmailUsuario(), usuario.getCelularUsuario(), usuario.getGeneroUsuario(),
						usuario.getSenhaUsuario());

			}
			if (!r.next()) {
				System.out.println( "NÃO HÁ DADOS" );
			}

		} catch (SQLException e) {
			System.out.println( "[LOG] Não foi possível acessar as informações." );
		}
	}



//UPDATE
	
	public void updateClient(Usuario usuario) {
		sql = "UPDATE usuario SET nomeUsuario = ?, sobrenomeUsuario = ?, emailUsuario = ?, celularUsuario = ?, generoUsuario = ?, senhaUsuario = ? WHERE idUsuario = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, usuario.getNomeUsuario());
			stmt.setString(2, usuario.getSobrenomeUsuario());
			stmt.setString(3, usuario.getEmailUsuario());
			stmt.setString(4, usuario.getCelularUsuario());
			stmt.setString(5, usuario.getGeneroUsuario());
			stmt.setString(6, usuario.getSenhaUsuario());

			stmt.executeUpdate();
			System.out.println("Cliente atualizado com sucesso\n" +  "Nome: "
					+ usuario.getNomeUsuario() + "\nSobrenome: " + usuario.getSobrenomeUsuario());

		} catch (SQLException e) {
			System.out.println( "[LOG] Não foi possível atualizar o cliente." + "Mensagem: " + e.getMessage());
		}
	}

//DELETE
	
	public void deleteClient(int id) {
		sql = "DELETE FROM usuario WHERE idUsuario = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setInt(1, id);

			stmt.executeUpdate();
			System.out.println( "Usuário deletado com sucesso!" );
		} catch (SQLException e) {
			System.out.println( "Não foi possível deletar o cliente." + "Mensagem: " + e.getMessage());
		}
	}


		
	}
	
	



