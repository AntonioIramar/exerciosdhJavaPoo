package br.com.dhexercio;

import java.io.Serializable;

public class Funcionario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nome;
	private String endereco;
	private String cpf;
	private String email;
	private String setor;
	private String dataAdmissao;
	private String dataDemissao;
	protected double salarioBase;

	
	public Funcionario() {
	}

	public Funcionario(String nome, String endereco, String cpf, String email, String setor, String dataAdmissao,
			String dataDemissao, double salarioBase) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.email = email;
		this.setor = setor;
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
		this.salarioBase = salarioBase;
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


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public void consultarContraCheque() {

		System.out.println("Salário disponivesl R$ : " + this.salarioBase);

	}
	
	public void verificarFerias(boolean ferias) {

		if (ferias == true) {

			System.out.println("Não pode trabalho");
		}
	}
}
