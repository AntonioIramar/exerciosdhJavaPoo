package br.com.dhexercio;

public class PessoaFisica extends Funcionario {
	
	final double banificarGerente = 0.12;
	final double banificarSurpervisor = 0.08;
	
	private String nit;
	private String cargo;

	public PessoaFisica() {

	}

	public PessoaFisica(String nit, String cargo) {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((nit == null) ? 0 : nit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaFisica other = (PessoaFisica) obj;
		if (nit == null) {
			if (other.nit != null)
				return false;
		} else if (!nit.equals(other.nit))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PessoaFisica [nit=" + nit + ", cargo=" + cargo + ", getId()=" + getId() + ", getNome()=" + getNome()
				+ ", getEndereco()=" + getEndereco() + ", getCpf()=" + getCpf() + ", getEmail()=" + getEmail()
				+ ", getSetor()=" + getSetor() + ", getDataAdmissao()=" + getDataAdmissao() + ", getDataDemissao()="
				+ getDataDemissao() + ", getSalarioBase()=" + getSalarioBase() + "]";
	}

	public double consultarContraCheque() {

		return this.salarioBase;

	}

	public void bonificacao() {

		if (this.cargo.equals("Gerente")) {

			this.salarioBase = salarioBase + (salarioBase * banificarGerente);
		}

		else if (this.cargo.equals("Supervisor")) {

			this.salarioBase = salarioBase + (salarioBase * banificarSurpervisor);

		} else {
			System.out.println("Bonificação não aplicada para o funcionário");
		}
	}

	public void reajustar(double reajuste) {

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

	public void gerenteDemitir() {

		if (this.cargo.equals("Surpervisor") || (this.cargo.equals("Funcionario"))) {
			
			System.out.println("Demitido");

		} else {
			
			System.out.println("Demissão negada");
		}
	}

	public void supervisorDemitir() {

		if (this.cargo.equals("Funcionario")) {
			
			System.out.println("Demitido");

		} else {
			
			System.out.println("Demissão negada");
		}
	}

	public void verificarFerias(boolean ferias) {

		if (ferias == true) {

			System.out.println("Não pode trabalhar em férias");
			
		} else {

			System.out.println("Não pode trabalhar em férias");
		}
	}

	public void funcSalicitar(String solicitaFunc) {

		if (solicitaFunc.equals("Trabalhar")) {

			System.out.println("Permisão consedida pelo gerente");

		} else if (solicitaFunc.equals("Demissão")) {

			this.gerenteDemitir();

		} else if (solicitaFunc.equals("Aumento")) {

			this.reajustar(0.15);

			System.out.println("aumento 0.15");

		} else {

			System.out.println("Solicitação enviada para analise");
		}

	}

}
