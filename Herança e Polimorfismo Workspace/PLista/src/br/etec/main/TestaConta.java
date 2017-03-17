package br.etec.main;

import br.etec.bean.Conta;
import br.etec.bean.ContaCorrente;
import br.etec.bean.ContaPoupanca;

class TestaContas {
	public static void main(String[] args) {
		Conta C = new Conta();
		Conta CC = new ContaCorrente();
		Conta CP = new ContaPoupanca();
		C.Deposita(1000);
		CC.Deposita(1000);
		CP.Deposita(1000);
		C.Atualiza(0.01);
		CC.Atualiza(0.01);
		CP.Atualiza(0.01);
		System.out.println(C.getSaldo());
		System.out.println(CC.getSaldo());
		System.out.println(CP.getSaldo());
	}
}

