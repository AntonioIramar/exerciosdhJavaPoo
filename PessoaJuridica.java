package br.com.dhexercio;

public class PessoaJuridica extends Funcionario {

	private static final long serialVersionUID = 1L;

	private String cnpj;
	private String cargo;

	public PessoaJuridica() {
	}

	public PessoaJuridica(String cnpj, String cargo) {

		this.cnpj = cnpj;
		this.cargo = cargo;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public void bonificacao() {

		if (this.cargo.equals("Gerente")) {

			double aumento = 0.12;

		 	this.salarioBase = salarioBase + (salarioBase * aumento);

			System.out.println("Novo salário R$ : " + salarioBase);
		}

		else if (this.cargo.equals("Supervisor")) {

			double aumento = 0.08;

			this.salarioBase = salarioBase + (salarioBase * aumento);

			System.out.println("Novo salário R$ : " + this.salarioBase);
		} else {
			System.out.println("Bonificação não aplicada para o funcionário");
		}
	}

	public void reajustarSalario(double salario, double reajusteSalarial) {

		if (reajusteSalarial > 0.00) {

			this.salarioBase = salario + reajusteSalarial;
			System.out.println("Novo salário com reajuste R$ : " + this.salarioBase);
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

	public void gerenteDemitir() {

		if (!this.cargo.equals("Gerente")) {

			System.out.println("Demitir um funcionário ou um supervisor!");

		}
	}

	public void supervisorDemitir() {

		if (!this.cargo.equals("Surpervisor") && (!this.cargo.equals("Gerente"))) {

			System.out.println("Demitir um funcionário!");
		}
	}


}