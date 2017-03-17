package br.etec.main;

import br.etec.bean.AtualizadorDeContas;
import br.etec.bean.Conta;
import br.etec.bean.ContaCorrente;
import br.etec.bean.ContaPoupanca;

class TestaAtualizadorDeContas {
	public static void main(String[] args) {
	Conta C = new Conta();
	Conta CC = new ContaCorrente();
	Conta CP = new ContaPoupanca();
	C.Deposita(1000);
	CC.Deposita(1000);
	CP.Deposita(1000);
	AtualizadorDeContas ADC = new AtualizadorDeContas(0.01);
	ADC.Roda(C);
	ADC.Roda(CC);
	ADC.Roda(CP);
	System.out.println("Saldo Total: " + ADC.getSaldoTotal());
	}
	}

