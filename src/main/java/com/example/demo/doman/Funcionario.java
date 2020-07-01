package com.example.demo.doman;

public class Funcionario {
	private int id;
	private String nome;
	private String sobrenome;
	private String dtnascimento;
	private String cargo;
	private String rg;
	private String cpf;
	private float salario;
	private String senha;
	public int getId() {
		return id;
	}
	public Funcionario() {
		super();
	}
	public Funcionario(int id, String nome, String sobrenome, String dtnascimento, String cargo, String rg, String cpf,
			float salario, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dtnascimento = dtnascimento;
		this.cargo = cargo;
		this.rg = rg;
		this.cpf = cpf;
		this.salario = salario;
		this.senha = senha;
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
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getDtnascimento() {
		return dtnascimento;
	}
	public void setDtnascimento(String dtnascimento) {
		this.dtnascimento = dtnascimento;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
