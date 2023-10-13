package com.roadofdreams.model;

public class Voo {

	private int idVoo;

	private String nomeAgencia;

	private String destinoAgencia;

	private String origemAgencia;

	private int codigoVoo;

	private int quantidadeLugares;

	private float precoVoo;

	private String dataidaVoo;

	private String datavoltaVoo;

	public Voo() {
		super();

	}

	public Voo(String nomeAgencia, String destinoAgencia, String origemAgencia, int codigoVoo, int quantidadeLugares,
			float precoVoo, String dataidaVoo, String datavoltaVoo) {
		super();
		this.nomeAgencia = nomeAgencia;
		this.destinoAgencia = destinoAgencia;
		this.origemAgencia = origemAgencia;
		this.codigoVoo = codigoVoo;
		this.quantidadeLugares = quantidadeLugares;
		this.precoVoo = precoVoo;
		this.dataidaVoo = dataidaVoo;
		this.datavoltaVoo = datavoltaVoo;
	}

	public int getIdVoo() {
		return idVoo;
	}

	public void setIdVoo(int idVoo) {
		this.idVoo = idVoo;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public String getDestinoAgencia() {
		return destinoAgencia;
	}

	public void setDestinoAgencia(String destinoAgencia) {
		this.destinoAgencia = destinoAgencia;
	}

	public String getOrigemAgencia() {
		return origemAgencia;
	}

	public void setOrigemAgencia(String origemAgencia) {
		this.origemAgencia = origemAgencia;
	}

	public int getCodigoVoo() {
		return codigoVoo;
	}

	public void setCodigoVoo(int codigoVoo) {
		this.codigoVoo = codigoVoo;
	}

	public int getQuantidadeLugares() {
		return quantidadeLugares;
	}

	public void setQuantidadeLugares(int quantidadeLugares) {
		this.quantidadeLugares = quantidadeLugares;
	}

	public float getPrecoVoo() {
		return precoVoo;
	}

	public void setPrecoVoo(float precoVoo) {
		this.precoVoo = precoVoo;
	}

	public String getDataidaVoo() {
		return dataidaVoo;
	}

	public void setDataidaVoo(String dataidaVoo) {
		this.dataidaVoo = dataidaVoo;
	}

	public String getDatavoltaVoo() {
		return datavoltaVoo;
	}

	public void setDatavoltaVoo(String datavoltaVoo) {
		this.datavoltaVoo = datavoltaVoo;
	}

	@Override
	public String toString() {
		return "Voo [idVoo=" + idVoo + ", nomeAgencia=" + nomeAgencia + ", destinoAgencia=" + destinoAgencia
				+ ", origemAgencia=" + origemAgencia + ", codigoVoo=" + codigoVoo + ", quantidadeLugares="
				+ quantidadeLugares + ", precoVoo=" + precoVoo + "]";
	}

	

}
