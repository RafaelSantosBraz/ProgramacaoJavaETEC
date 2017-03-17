package br.etec.bean;

public class AtualizadorDeContas {
	private double SaldoTotal = 0;
	private double Selic;
	
	public AtualizadorDeContas(double Selic) {
		this.Selic = Selic;
	}
	public void Roda(Conta c) {
		System.out.print("Saldo Inicial: " + getSaldoTotal());
		this.SaldoTotal += Selic;
		System.out.print("Saldo Final: " + getSaldoTotal());
	}
	public double getSaldoTotal() {
		return SaldoTotal;
	}
	
}
