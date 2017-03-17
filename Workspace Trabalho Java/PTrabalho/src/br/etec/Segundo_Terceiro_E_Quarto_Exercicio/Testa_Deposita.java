package br.etec.Segundo_Terceiro_E_Quarto_Exercicio;

import javax.swing.JOptionPane;

public class Testa_Deposita {

	public static void main(String[] args) {
		
		Conta C = new Conta();
		C.Deposita(Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:")));
		
		/** Resposta:
		 * O sistema retorna os seguintes eros;
		 * 
		 * Exception in thread "main" java.lang.IllegalArgumentException
	     * at br.etec.Segundo_Terceiro_E_Quarto_Exercicio.Conta.Deposita(Conta.java:18)
	     * at br.etec.Segundo_Terceiro_E_Quarto_Exercicio.Testa_Deposita.main(Testa_Deposita.java:10)
	     * 
	     * Com isso é possível perceber que o erro foi ocasionado por passar um argumento ilegal ao 
	     * sistema e nestas três linhas está descrita a "trilha" do erro. A primeira linha informa que
	     * o erro foi ocasionado por um argumento ilegal. A segunda linha mostra que ocorreu o erro no 
	     * método Deposita da classe Conta. Já a terceira linha mostra que houve um erro no método Main 
	     * da classe Testa_Deposita.
		 */
	}
}

