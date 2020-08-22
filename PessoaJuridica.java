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

			System.out.println("Novo sal�rio R$ : " + salarioBase);
		}

		else if (this.cargo.equals("Supervisor")) {

			double aumento = 0.08;

			this.salarioBase = salarioBase + (salarioBase * aumento);

			System.out.println("Novo sal�rio R$ : " + this.salarioBase);
		} else {
			System.out.println("Bonifica��o n�o aplicada para o funcion�rio");
		}
	}

	public void reajustarSalario(double salario, double reajusteSalarial) {

		if (reajusteSalarial > 0.00) {

			this.salarioBase = salario + reajusteSalarial;
			System.out.println("Novo sal�rio com reajuste R$ : " + this.salarioBase);
		}

		else {
			System.out.println("Reajuste salarial n�o aplicado!");
		}
	}

	public void requisitarFerias(int qtdMesesTempoEmpresa, int qtdMesesRetornoFerias) {

		if (qtdMesesTempoEmpresa >= 11 && qtdMesesRetornoFerias >= 4) {
			System.out.println("Voc� j� pode tirar f�rias ");

		} else {
			System.out.println("Voc� n�o pode tirar f�rias ");
		}
	}

	public void gerenteDemitir() {

		if (!this.cargo.equals("Gerente")) {

			System.out.println("Demitir um funcion�rio ou um supervisor!");

		}
	}

	public void supervisorDemitir() {

		if (!this.cargo.equals("Surpervisor") && (!this.cargo.equals("Gerente"))) {

			System.out.println("Demitir um funcion�rio!");
		}
	}


}