package model.entities;

public class FuncionarioRemoto extends Funcionario {
	private Double taxaSalario;

	public FuncionarioRemoto(String nome, String cargo, Integer numero, Double salario, Double taxa) {
		super(nome, cargo, numero, salario);
		this.taxaSalario = taxa;
	}

	public Double getTaxaSalario() {
		return taxaSalario;
	}

	public void setTaxaSalario(Double taxaSalario) {
		this.taxaSalario = taxaSalario;
	}
	
	public void aumentarSalario(Double valor, Double taxa) {
		salario += (valor - taxa);
	}
	
}
