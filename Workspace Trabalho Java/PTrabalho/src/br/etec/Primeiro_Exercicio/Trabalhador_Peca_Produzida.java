package br.etec.Primeiro_Exercicio;

public class Trabalhador_Peca_Produzida extends Empregado implements Calculo_Ganhos{
	
	private double Valor;
	private int Quantidade;
	
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	
	public void Mostrar_Dados(){
		Mostrar_Dados_Empregado();
		System.out.println(getValor());
		System.out.println(getQuantidade());
	}
	
	public void Calcular_Ganho(double Valor, double Quantidade) {
		setSalario(getSalario() + (Valor * Quantidade));
	}
}
