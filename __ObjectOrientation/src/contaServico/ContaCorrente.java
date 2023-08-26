/**
 * 
 */
package contaServico;

/**
 * @author luiz.gnovale
 *
 */
public class ContaCorrente extends Conta{
	
	String tipo = "Conta corrente";

	public ContaCorrente(double saldo, String identificador, String tipo) {
		super(saldo, identificador);
		// TODO Auto-generated constructor stub
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}