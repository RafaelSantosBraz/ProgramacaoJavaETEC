package br.etec.bean;

public class ContaPoupanca extends Conta{
	 public double Atualiza(double Taxa) {
		return super.Atualiza(Taxa) * 3;
	}

}
