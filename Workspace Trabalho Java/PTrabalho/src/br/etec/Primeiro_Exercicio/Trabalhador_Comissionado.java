package br.etec.Primeiro_Exercicio;

public class Trabalhador_Comissionado extends Empregado implements Calculo_Ganhos{

	private int Vendas;
	private double Porcentagem;

	public int getVendas() {
		return Vendas;
	}
	public void setVendas(int vendas) {
		Vendas = vendas;
	}
	public double getPorcentagem() {
		return Porcentagem;
	}
	public void setPorcentagem(double porcentagem) {
		Porcentagem = porcentagem;
	}

	public void Calcular_Ganho(double Porcentagem, double Vendas){
		setSalario(getSalario() + (Porcentagem * Vendas));
	}

	public void Mostrar_Dados(){
		Mostrar_Dados_Empregado();
		System.out.println(getVendas());
		System.out.println(getPorcentagem());
	}
}
