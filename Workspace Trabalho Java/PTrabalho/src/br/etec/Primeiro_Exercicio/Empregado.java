package br.etec.Primeiro_Exercicio;

public class Empregado {
	
	private String Nome;
	private int CPF;
	private int RG;
	private String Cidade;
	private String Bairro;
	private int CEP;
	private String Rua;
	private int Telefone;
	private double Salario;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cpf) {
		CPF = cpf;
	}
	public int getRG() {
		return RG;
	}
	public void setRG(int rg) {
		RG = rg;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public int getCEP() {
		return CEP;
	}
	public void setCEP(int cep) {
		CEP = cep;
	}
	public String getRua() {
		return Rua;
	}
	public void setRua(String rua) {
		Rua = rua;
	}
	public int getTelefone() {
		return Telefone;
	}
	public void setTelefone(int telefone) {
		Telefone = telefone;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	
	public void Mostrar_Dados_Empregado(){
		System.out.println(getBairro());
		System.out.println(getCEP());
		System.out.println(getCidade());
		System.out.println(getCPF());
		System.out.println(getNome());
		System.out.println(getRG());
		System.out.println(getRua());
		System.out.println(getSalario());
		System.out.println(getTelefone());
	}
}
