package br.com.dhexercio;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Funcionario func = new Funcionario ("Maria Rios", "Rua sete de Abril, 3443", "555.777.890-67", "mm.martins@yahoo.com.br", "TI", "20/10/2000", "01/01/0001", 45000.00);
		func.setEndereco("Rua Margarida, 3434");

		JOptionPane.showMessageDialog(null, "Nome : " + func.getNome() + "\n Endereço : " + func.getEndereco()
				+ "\n CPF : " + func.getCpf() + "\n E-Mail : " + func.getEmail() + "\n Setor: " + func.getSetor());

		PessoaJuridica pj = new PessoaJuridica("55.777.890/0001", "Analista de Sistemas");
		pj.setNome(JOptionPane.showInputDialog(null, "Informe o novo do nome."));

		JOptionPane.showMessageDialog(null, "Nome : " + pj.getNome() + "\n CNPJ : " + pj.getCnpj() + "\n Cargo: "
				+ pj.getCargo());

	   PessoaFisica pf = new PessoaFisica();
	   
	   
	     pf.setSalarioBase(3000.00);

	     pf.consultarContraCheque();

	     pf.reajustarSalario(12000.00, 1000.00);
		
		 pf.requisitarFerias(11, 4);
				
		 pj.setSalarioBase(3000.00);

	     pj.consultarContraCheque();

	     pj.reajustarSalario(12000.00, 1000.00);
		
	     pj.requisitarFerias(11, 4);

	}
}


 
/*
 * public class FuncionarioTeste {
 * 
 * private String nome; private String cfunc; private double salario; private
 * int tipo = 0; //0 = Funcionário comum; 1 = Gerente; 2 = Diretor
 * 
 * public double getBonificacao() {
 * 
 * if(this.tipo == 0) { // Funcionário comum; return this.salario * 0.1; } else
 * if(this.tipo == 1) { // Gerente; return this.salario; } else { return
 * this.salario + 1000.0; }
 * 
 * }
 * 
 * public void setTipo(int tipo) { this.tipo = tipo; }
 * 
 * public int getTipo() { return tipo; }
 */