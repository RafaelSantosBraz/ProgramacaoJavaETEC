package br.etec.Segundo_Terceiro_E_Quarto_Exercicio;

public class Conta {

	private double Saldo;

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public void Deposita(double Valor){
		try{
		if (Valor < 0){
			throw new IllegalArgumentException();
		} else {
			this.Saldo += Valor - 0.10;
			System.out.println("O valor digitado é VÁLIDO!");
		}
		} catch (IllegalArgumentException e) {
			System.out.println("O valor digitado é INVÁLIDO!");
		}
	}
}
