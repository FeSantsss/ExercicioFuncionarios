package model.entities;

public abstract class Funcionario {
	protected String nome;
	protected String cargo;
	protected Integer numero;
	protected Double salario;
	
	public Funcionario(String nome, String cargo, Integer numero, Double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.numero = numero;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Integer getNumero() {
		return numero;
	}

	public Double getSalario() {
		return salario;
	}
	
}
