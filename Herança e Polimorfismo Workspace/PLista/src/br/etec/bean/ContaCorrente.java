package br.etec.bean;

public class ContaCorrente extends Conta{
	 public double Atualiza(double Taxa) {
		return super.Atualiza(Taxa) * 2;
	}
	 public void Deposita(double Valor) {
		this.Saldo += Valor - 0.10;
	}

}
