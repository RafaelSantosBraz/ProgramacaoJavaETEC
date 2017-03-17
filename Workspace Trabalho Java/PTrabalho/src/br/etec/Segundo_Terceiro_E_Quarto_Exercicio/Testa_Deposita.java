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
	     * Com isso � poss�vel perceber que o erro foi ocasionado por passar um argumento ilegal ao 
	     * sistema e nestas tr�s linhas est� descrita a "trilha" do erro. A primeira linha informa que
	     * o erro foi ocasionado por um argumento ilegal. A segunda linha mostra que ocorreu o erro no 
	     * m�todo Deposita da classe Conta. J� a terceira linha mostra que houve um erro no m�todo Main 
	     * da classe Testa_Deposita.
		 */
	}
}

