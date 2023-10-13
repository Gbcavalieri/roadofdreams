package com.roadofdreams.model;

public class Compra {

	private int idCompra;

	private String formaPagamento;

	private String dataCompra;

	private String quantidadeCompra;

	private float valortotalCompra;

	private String agenciaArea;

	private String passagemCompra;

	private Usuario usuario;

	private Voo voo;

	public Compra() {
		super();

	}

	public Compra(String formaPagamento, String dataCompra, String quantidadeCompra, float valortotalCompra,
			String agenciaArea, String passagemCompra) {
		super();
		this.formaPagamento = formaPagamento;
		this.dataCompra = dataCompra;
		this.quantidadeCompra = quantidadeCompra;
		this.valortotalCompra = valortotalCompra;
		this.agenciaArea = agenciaArea;
		this.passagemCompra = passagemCompra;
	}

	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}

	public String getQuantidadeCompra() {
		return quantidadeCompra;
	}

	public void setQuantidadeCompra(String quantidadeCompra) {
		this.quantidadeCompra = quantidadeCompra;
	}

	public float getValortotalCompra() {
		return valortotalCompra;
	}

	
	public void setValortotalCompra(float valortotalCompra) {
		this.valortotalCompra = valortotalCompra;
	}

	public String getAgenciaArea() {
		return agenciaArea;
	}

	public void setAgenciaArea(String agenciaArea) {
		this.agenciaArea = agenciaArea;
	}

	public String getPassagemCompra() {
		return passagemCompra;
	}

	public void setPassagemCompra(String passagemCompra) {
		this.passagemCompra = passagemCompra;
	}

	@Override
	public String toString() {
		return "Compra [idCompra=" + idCompra + ", formaPagamento=" + formaPagamento + ", dataCompra=" + dataCompra
				+ ", quantidadeCompra=" + quantidadeCompra + ", valortotalCompra=" + valortotalCompra + ", agenciaArea="
				+ agenciaArea + ", passagemCompra=" + passagemCompra + "]";
	}

	public String agenciaAerea() {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	
	}

}
