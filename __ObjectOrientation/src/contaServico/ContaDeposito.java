/**
 * 
 */
package contaServico;

/**
 * @author luiz.gnovale
 *
 */
public class ContaDeposito extends Conta{
	
	String tipo = "Conta depósito";

	public ContaDeposito(double saldo, String identificador, String tipo) {
		super(saldo, identificador);
		// TODO Auto-generated constructor stub
		this.tipo = tipo;
	}

}