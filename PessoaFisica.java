package br.com.dhexercio;

//R/-\/\/classe externa

public class PessoaFisica extends Funcionario {
	private static final long serialVersionUID = 1L;

	private String nit;
	private String cargo;
	

	public PessoaFisica() {
		
	}
    
	
	public PessoaFisica(String nome, String endereco, String cpf, String email, String setor, String dataAdmissao,
			String dataDemissao, double salarioBase, String nit, String cargo) {
		super(nome, endereco, cpf, email, setor, dataAdmissao, dataDemissao, salarioBase);
		this.nit = nit;
		this.cargo = cargo;
		
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;

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
