/**
 * 
 */
package entidade;

import contaServico.Conta;

/**
 * @author luiz.gnovale
 *
 */
public class Cliente extends Entidade{
	
	Conta conta;

	public Cliente(String nome, int idade, Conta conta) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
		this.conta = conta;
	}
	
	public void retornaDadosConta(Conta conta) {
		System.out.println("Id.: " + conta.getidentificador());
		System.out.println("Saldo: " + conta.getSaldo());
	}

}