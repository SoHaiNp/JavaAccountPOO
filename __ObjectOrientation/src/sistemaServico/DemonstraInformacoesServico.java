package sistemaServico;

import contaServico.ContaCorrente;
import entidade.Cliente;

public class DemonstraInformacoesServico {
	
	Cliente cliente;
	ContaCorrente conta;
	
	/*
	 * Método para retornar os dados base da conta do cliente, onde retorna:
	 * 1. O titular da conta;
	 * 2. O código da conta;
	 * 3. O tipo da conta;
	 * 4. O saldo da conta.
	 * 
	 * Ex.:
	 * | Titular:	Luiz Guilherme
	 * | Código:	04042000
	 * | Tipo:		Conta corrente
	 * | Saldo:	3542,00
	 */
	public void retornaDadosBaseConta(Cliente cliente, ContaCorrente contaCliente) {
		System.out.printf("| Titular:	%s\n| Código:	%s\n| Tipo:		%s\n| Saldo:	%f", cliente.getNome(), contaCliente.getidentificador(), contaCliente.getTipo(), contaCliente.getSaldo());
	}

}
