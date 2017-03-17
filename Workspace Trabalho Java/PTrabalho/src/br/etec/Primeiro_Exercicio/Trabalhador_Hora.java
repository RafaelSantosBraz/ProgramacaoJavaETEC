package br.etec.Primeiro_Exercicio;

public class Trabalhador_Hora extends Empregado implements Calculo_Ganhos{
	
	private double Valor_Hora;
	private int Quantidade_Horas;
	
	public double getValor_Hora() {
		return Valor_Hora;
	}
	public void setValor_Hora(double valor_Hora) {
		Valor_Hora = valor_Hora;
	}
	public int getQuantidade_Horas() {
		return Quantidade_Horas;
	}
	public void setQuantidade_Horas(int quantidade_Horas) {
		Quantidade_Horas = quantidade_Horas;
	}
	
	public void Mostrar_Dados(){
		Mostrar_Dados_Empregado();
		System.out.println(getValor_Hora());
		System.out.println(getQuantidade_Horas());
	}
	
	public void Calcular_Ganho(double Valor, double Quantidade) {
		setSalario(getSalario() + (Valor * Quantidade));
	}
}
