package com.roadofdreams.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.roadofdreams.model.Compra;

public class CompraDAO {

	private static String sql;

	private final Connection connection;

	public CompraDAO(Connection connection) {
		this.connection = connection;

	}

//CREATE

	public void createCompra(Compra compra) {
		sql = "INSERT INTO compra (formaPagamento, dataCompra, quantidadeCompra, valortotalCompra, agenciaArea, passagemCompra) VALUES (?,?,?,?,?,?)";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, compra.getFormaPagamento());
			stmt.setString(2, compra.getDataCompra());
			stmt.setString(3, compra.getQuantidadeCompra());
			stmt.setFloat(4, compra.getValortotalCompra());
			stmt.setString(5, compra.getAgenciaArea());
			stmt.setString(6, compra.getPassagemCompra());

			stmt.executeUpdate();
			System.out.println("Compra efetuada com sucesso!" + compra.getValortotalCompra());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}




	// READ
		public void readAllClients() {
			sql = "SELECT * FROM compra";
			try (PreparedStatement stmt = connection.prepareStatement(sql)) {
				ResultSet r = stmt.executeQuery();
				while (r.next()) {
					Compra compra = new Compra();
					compra.setIdCompra(r.getInt("idCompra"));
					compra.setFormaPagamento(r.getString("formaPagamento"));
					compra.setDataCompra(r.getString("dataCompra"));
					compra.setQuantidadeCompra(r.getString("quantidadeCompra"));
					compra.setValortotalCompra(r.getFloat("valortotalCompra"));
					compra.setAgenciaArea(r.getString("agenciaArea"));
					compra.setPassagemCompra(r.getString("passagemCompra"));
					
					System.out.printf("ID: %d\n Forma de pagamento: %s\n Data da compra: %s\n Quantidade: %s\n Passagem: %s\n Agência aérea: $s\n Valor total: $s\n", compra.getIdCompra(),
							compra.getFormaPagamento(), compra.getDataCompra(), compra.getQuantidadeCompra(), compra.getValortotalCompra(), compra.getAgenciaArea(), compra.getPassagemCompra());
							

				}
				if (!r.next()) {
					System.out.println( "NAO HÁ DADOS" );
				}

			} catch (SQLException e) {
				System.out.println( "[LOG] Não foi possível acessar as informações." + "Mensagem: " + e.getMessage());
			}
		}


		// UPDATE
		public void updateClient(Compra compra) {
			sql = "UPDATE compra SET formapagamento = ?, datacompra = ?, quantidadecompra = ?, valortotalcompra = ? agenciaarea = ? passagemcompra = ? WHERE idcompra = ?";
			try (PreparedStatement stmt = connection.prepareStatement(sql)) {
				stmt.setString(1, compra.getFormaPagamento());
				stmt.setString(2, compra.getDataCompra());
				stmt.setString(3, compra.getQuantidadeCompra());
				stmt.setFloat(4, compra.getValortotalCompra());
				stmt.setString(5, compra.getAgenciaArea());
				stmt.setString(6, compra.getPassagemCompra());

				stmt.executeUpdate();
				System.out.println( "Compra atualizada com sucesso\n");

			} catch (SQLException e) {
				System.out.println( "[LOG] Não foi possível atualizar a compra." + "Mensagem: " + e.getMessage());
			}
		}


		// DELETE
		public void deleteCompra(int idCompra) {
			sql = "DELETE FROM compra WHERE idCompra = ?";
			try (PreparedStatement stmt = connection.prepareStatement(sql)) {
				stmt.setInt(1, idCompra);

				stmt.executeUpdate();
				System.out.println( "Compra deletada com sucesso!" );
			} catch (SQLException e) {
				System.out.println( "Não foi possível deletar a compra." + "Mensagem: " + e.getMessage());
			}
		}
		
		

}
