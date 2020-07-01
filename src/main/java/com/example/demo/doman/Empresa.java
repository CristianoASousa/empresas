package com.example.demo.doman;

public class Empresa {
	private int id;
	private String nome;
	private String cnpj;
	private String endereco;
	private String email;
	public int getId() {
		return id;
	}
	public Empresa() {
		super();
	}
	public Empresa(int id, String nome, String cnpj, String endereco, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.email = email;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
