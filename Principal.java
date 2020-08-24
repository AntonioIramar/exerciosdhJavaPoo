package br.com.dhexercio;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Funcionario func = new Funcionario(null, "Maria Rios", "Rua sete de Abril, 3443", "555.777.890-67",
				"mm.martins@yahoo.com.br", "TI", "20/10/2000", "01/01/0001", 3500.00, "Supervisor");
		func.setEndereco("Rua Margarida, 3434");

		JOptionPane.showMessageDialog(null,
				"Nome : " + func.getNome() + "\n Endereço : " + func.getEndereco() + "\n CPF : " + func.getCpf()
						+ "\n E-Mail : " + func.getEmail() + "\n Setor: " + func.getSetor() + "\n Cargo: "
						+ func.getCargo());

		PessoaJuridica pj = new PessoaJuridica("55.777.890/0001");
		pj.setNome("Tecnológia inovação");
		pj.setEmail("mmmti@gmail.com");
		pj.setCargo("PJ");
		JOptionPane.showMessageDialog(null, "Nome : " + pj.getNome() + "\n CNPJ : " + pj.getCnpj() + "\n Cargo: "
				+ pj.getCargo() + "\n E-Mail : " + pj.getEmail());

		Funcionario f1 = new Funcionario();

		f1.setSalarioBase(11000.00);

		f1.setCargo("Funcionario");

		f1.reajustar(0.12);

		System.out.println("Reajuste para o cargo de " + f1.getCargo() + " R$ : " + f1.getSalarioBase());

		f1.consultarContraCheque();

		System.out.println("Valor disponivel para o cargo de " + f1.getCargo() + " R$ : " + f1.getSalarioBase());

		PessoaFisica pf = new PessoaFisica();

		pf.setSalarioBase(11000.00);

		pf.setCargo("Supervisor");

		pf.reajustar(0.12);

		System.out.println("Reajuste salarial PF, para o cargo de " + pf.getCargo() + " R$ : " + pf.getSalarioBase());

		pf.bonificacao();

		System.out.println("Bonificação padão PF, para o cargo de " + pf.getCargo() + " R$ : " + pf.getSalarioBase());

		pf.consultarContraCheque();

		System.out.println("Saldo disponivel PF, para o cargo de " + pf.getCargo() + " R$ : " + pf.getSalarioBase());

		pf.setCargo("Supervisor");

		pf.gerenteDemitir();

		pf.setCargo("Funcionario");

		pf.supervisorDemitir();

		pf.requisitarFerias(10, 4);

		pf.funcSalicitar("Demissão");

		PessoaJuridica j1 = new PessoaJuridica();

		j1.setSalarioBase(11000.00);

		j1.setCargo("Analista de Sistemas");

		j1.reajustar(0.25);

		System.out.println("Reajuste salarial PJ, para o cargo de " + j1.getCargo() + " R$ : " + j1.getSalarioBase());

		j1.consultarContraCheque();

		System.out.println(
				"Saldo disponivel PJ, disponivel para o cargo de " + j1.getCargo() + " R$ : " + j1.getSalarioBase());
	}
}
