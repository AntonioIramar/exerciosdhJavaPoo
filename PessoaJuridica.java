package br.com.dhexercio;

public class PessoaJuridica extends Funcionario {

	private String cnpj;

	public PessoaJuridica() {
	}

	public PessoaJuridica(String cnpj) {

		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", getId()=" + getId() + ", getNome()=" + getNome() + ", getEndereco()="
				+ getEndereco() + ", getCpf()=" + getCpf() + ", getEmail()=" + getEmail() + ", getSetor()=" + getSetor()
				+ ", getDataAdmissao()=" + getDataAdmissao() + ", getDataDemissao()=" + getDataDemissao()
				+ ", getCargo()=" + getCargo() + "]";
	}

	public double consultarContraCheque() {

		return this.salarioBase;

	}

	public void reajustarSalario(double reajuste) {

		if (reajuste > 0.00) {

			this.salarioBase = salarioBase + (salarioBase * reajuste);
		}

		else {
			System.out.println("Reajuste salarial não aplicado!");
		}
	}

	public void requisitarFerias(int qtdMesesTempoEmpresa, int qtdMesesRetornoFerias) {

		if (qtdMesesTempoEmpresa >= 11 && qtdMesesRetornoFerias >= 4) {
			System.out.println("Você já pode tirar férias ");

		} else {
			System.out.println("Você não pode tirar férias ");
		}
	}

}