package com.roadofdreams.model;

public class Usuario {

	private int idUsuario;

	private String nomeUsuario;

	private String sobrenomeUsuario;

	private String emailUsuario;

	private String celularUsuario;

	private String generoUsuario;

	private String senhaUsuario;

	public Usuario() {
		super();

	}

	public Usuario(String nomeUsuario, String sobrenomeUsuario, String emailUsuario, String celularUsuario,
			String generoUsuario, String senhaUsuario) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.sobrenomeUsuario = sobrenomeUsuario;
		this.emailUsuario = emailUsuario;
		this.celularUsuario = celularUsuario;
		this.generoUsuario = generoUsuario;
		this.senhaUsuario = senhaUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSobrenomeUsuario() {
		return sobrenomeUsuario;
	}

	public void setSobrenomeUsuario(String sobrenomeUsuario) {
		this.sobrenomeUsuario = sobrenomeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getCelularUsuario() {
		return celularUsuario;
	}

	public void setCelularUsuario(String celularUsuario) {
		this.celularUsuario = celularUsuario;
	}

	public String getGeneroUsuario() {
		return generoUsuario;
	}

	public void setGeneroUsuario(String generoUsuario) {
		this.generoUsuario = generoUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nomeUsuario=" + nomeUsuario + ", sobrenomeUsuario="
				+ sobrenomeUsuario + ", emailUsuario=" + emailUsuario + ", celularUsuario=" + celularUsuario
				+ ", generoUsuario=" + generoUsuario + ", senhaUsuario=" + senhaUsuario + "]";
	}

}
