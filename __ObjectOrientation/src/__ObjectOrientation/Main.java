package __ObjectOrientation;

import contaServico.ContaCorrente;
import entidade.Cliente;
import sistemaServico.DemonstraInformacoesServico;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaCorrente contaCorrenteUm = new ContaCorrente(3452.00, "04042000", "Conta Corrente");
		Cliente clienteLuizGuilherme = new Cliente("Luiz Guilherme", 23, contaCorrenteUm);
		DemonstraInformacoesServico plotDados = new DemonstraInformacoesServico();
		
		//clienteLuizGuilherme.retornaDadosConta(contaCorrenteUm);
		plotDados.retornaDadosBaseConta(clienteLuizGuilherme, contaCorrenteUm);
	}

}
