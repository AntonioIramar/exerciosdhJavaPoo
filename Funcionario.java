package br.com.dhexercio;

public class Funcionario {
	private Long id;
	private String nome;
	private String endereco;
	private String cpf;
	private String email;
	private String setor;
	private String dataAdmissao;
	private String dataDemissao;
	protected double salarioBase;
	private String cargo;

	public Funcionario() {
	}

	public Funcionario(Long id, String nome, String endereco, String cpf, String email, String setor,
			String dataAdmissao, String dataDemissao, double salarioBase, String cargo) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.email = email;
		this.setor = setor;
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
		this.salarioBase = salarioBase;
		this.cargo = cargo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(String dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
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
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf + ", email="
				+ email + ", setor=" + setor + ", dataAdmissao=" + dataAdmissao + ", dataDemissao=" + dataDemissao
				+ ", salarioBase=" + salarioBase + ", cargo=" + cargo + "]";
	}

   public double consultarContraCheque() {

		return this.salarioBase;

	}

	public void verificarFerias(boolean ferias) {

		if (ferias == true) {

			System.out.println("Não pode trabalhar em férias");
		} else {

			System.out.println("Não pode trabalhar em férias");
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

	
}
