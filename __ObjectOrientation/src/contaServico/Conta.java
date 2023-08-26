/**
 * 
 */
package contaServico;

/**
 * @author luiz.gnovale
 *
 */
public class Conta {

	double saldo;
	String identificador;
	
	public Conta(double saldo, String identificador) {
		this.saldo = saldo;
		this.identificador = identificador;
	}

	//Retorna saldo da conta do cliente...
	public double getSaldo() {
		return saldo;
	}
	
	//Deposita dinheiro na conta do cliente...
	public void depositaDinheiroConta(int saldo, int valor) {
		this.saldo += valor;
	}

	//Saca dinheiro na conta do cliente...	
	public void sacaDinheiroConta(int saldo, int valor) {
		this.saldo -= valor;
	}	
	
	public String getidentificador() {
		return identificador;
	}
	
	public void setidentificador(String identificador) {
		this.identificador = identificador;
	}

}
