package br.etec.bean;

public class Conta {
	protected double Saldo;
	public void Deposita(double Valor) {
		this.Saldo += Valor;
	}
	void Saca(double Valor) {
		this.Saldo -= Valor;
	}
	public double getSaldo() {
		return this.Saldo;
	}
	public double Atualiza(double Taxa) {
		return this.Saldo += this.Saldo * Taxa;
	}

}
