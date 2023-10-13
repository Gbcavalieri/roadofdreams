package com.roadofdreams.model;

public class Contato {

	private int idContato;

	private String nomeContato;

	private String emailContato;

	private String assuntoContato;

	private String telefoneContato;

	private String mensagemContato;

	public Contato() {
		super();

	}

	public Contato(String nomeContato, String emailContato, String assuntoContato, String telefoneContato,
			String mensagemContato) {
		super();
		this.nomeContato = nomeContato;
		this.emailContato = emailContato;
		this.assuntoContato = assuntoContato;
		this.telefoneContato = telefoneContato;
		this.mensagemContato = mensagemContato;
	}

	public int getIdContato() {
		return idContato;
	}

	public void setIdContato(int idContato) {
		this.idContato = idContato;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getEmailContato() {
		return emailContato;
	}

	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}

	public String getAssuntoContato() {
		return assuntoContato;
	}

	public void setAssuntoContato(String assuntoContato) {
		this.assuntoContato = assuntoContato;
	}

	public String getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}

	public String getMensagemContato() {
		return mensagemContato;
	}

	public void setMensagemContato(String mensagemContato) {
		this.mensagemContato = mensagemContato;
	}

	@Override
	public String toString() {
		return "Contato [idContato=" + idContato + ", nomeContato=" + nomeContato + ", emailContato=" + emailContato
				+ ", assuntoContato=" + assuntoContato + ", telefoneContato=" + telefoneContato + ", mensagemContato="
				+ mensagemContato + "]";
	}
}
