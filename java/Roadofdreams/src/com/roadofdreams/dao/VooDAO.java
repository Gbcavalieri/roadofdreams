package com.roadofdreams.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.roadofdreams.model.Voo;

public class VooDAO {

	private static String sql;

	private final Connection connection;

	public VooDAO(Connection connection) {
		this.connection = connection;
	}

	// CREATE

	public void createVoo(Voo voo) {
		sql = "INSERT INTO voo (nomeAgencia, destinoAgencia, origemAgencia, codigoVoo, quantidadeLugares, precoVoo, dataidaVoo, datavoltaVoo) VALUES (?,?,?,?,?,?,?,?)";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, voo.getNomeAgencia());
			stmt.setString(2, voo.getDestinoAgencia());
			stmt.setString(3, voo.getOrigemAgencia());
			stmt.setInt(4, voo.getCodigoVoo());
			stmt.setInt(0, voo.getQuantidadeLugares());
			stmt.setFloat(6, voo.getPrecoVoo());
			stmt.setString(7, voo.getDataidaVoo());
			stmt.setString(8, voo.getDatavoltaVoo());

			stmt.executeUpdate();
			System.out.println("Voo encontrado com sucesso!" + voo.getIdVoo());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	// READ
	public void readAllClients() {
		sql = "SELECT * FROM voo";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			ResultSet r = stmt.executeQuery();
			while (r.next()) {
				Voo voo = new Voo();
				voo.setIdVoo(r.getInt("idVoo"));
				voo.setNomeAgencia(r.getString("nomeAgencia"));
				voo.setDestinoAgencia(r.getString("destinoAgencia"));
				voo.setOrigemAgencia(r.getString("origemAgencia"));
				voo.setCodigoVoo(r.getInt("codigoVoo"));
				voo.setQuantidadeLugares(r.getInt("quantidadeLugares"));
				voo.setPrecoVoo(r.getInt("precoVoo"));
				voo.setDataidaVoo(r.getString("dataidaVoo"));
				voo.setDatavoltaVoo(r.getString("datavoltaVoo"));

				System.out.printf(
						"ID: %d\n Nome da Agência: %s\n Destino: %s\n Origem: %s\n Código: %s\n Lugares disponíveis: %s\\n Preço: %s\\n Data de ida: %s\\n  data de volta: %s\\n",
						voo.getIdVoo(), voo.getNomeAgencia(), voo.getDestinoAgencia(), voo.getOrigemAgencia(),
						voo.getCodigoVoo(), voo.getQuantidadeLugares(), voo.getPrecoVoo(), voo.getDataidaVoo(),
						voo.getDatavoltaVoo());

			}
			if (!r.next()) {
				System.out.println("NÃO Há DADOS");
			}

		} catch (SQLException e) {
			System.out.println("[LOG] Não foi possível acessar as informações." + "Mensagem: " + e.getMessage());
		}
	}

	// UPDATE
	public void updateClient(Voo voo) {
		sql = "UPDATE voo SET nomeAgencia = ?, destinoAgencia = ?, origemAgencia = ?, codigoVoo = ?, quantidadeLugares = ?, precoVoo = ?, dataidaVoo = ?, datavoltaVoo = ? WHERE idVoo = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, voo.getNomeAgencia());
			stmt.setString(2, voo.getDestinoAgencia());
			stmt.setString(3, voo.getOrigemAgencia());
			stmt.setInt(4, voo.getCodigoVoo());
			stmt.setInt(5, voo.getQuantidadeLugares());
			stmt.setFloat(6, voo.getPrecoVoo());
			stmt.setString(7, voo.getDataidaVoo());
			stmt.setString(8, voo.getDatavoltaVoo());
			stmt.executeUpdate();
			System.out.println("Voo atualizado com sucesso\n");

		} catch (SQLException e) {
			System.out.println("[LOG] Não foi possível atualizar o voo." + "Mensagem: " + e.getMessage());
		}
	}


	// DELETE
		public void deleteClient(int id) {
			sql = "DELETE FROM voo WHERE idVoo = ?";
			try (PreparedStatement stmt = connection.prepareStatement(sql)) {
				stmt.setInt(1, id);

				stmt.executeUpdate();
				System.out.println( "Voo deletado com sucesso!" );
			} catch (SQLException e) {
				System.out.println(  "Não foi possível deletar o voo." + "Mensagem: " + e.getMessage());
			}
		}

}
