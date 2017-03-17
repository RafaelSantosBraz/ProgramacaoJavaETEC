package br.etec.bean;

public class Conta {
	private int numero_conta;
	private int agencia;
	private double saldo;
	private double limite;
	private String tipo;
	private int senha;
	Cliente Titular;

	Conta(Cliente titular) {
		this.Titular = titular;
	}

	public int getNumero_conta() {
		return numero_conta;
	}
	public void setNumero_conta(int numero_conta) {
		this.numero_conta = numero_conta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public double getSaldo() {
		return saldo;
	}
	public boolean Sacar (double valor){
		if (this.saldo > valor) {
			double novosaldo = this.saldo - valor;	
			this.saldo = novosaldo;
			return true;
		} else {
			return false;
		}
	}
	public void Depositar (double valor){
		//this.saldo += valor;
		if (valor < 0) {
			throw new IllegalArgumentException();
		} else {
			this.saldo += valor * 0.9962;
		}

	}
	public boolean Transferir (double valor,Conta destino){
		boolean resp = this.Sacar(valor);
		if (resp == true) {
			destino.Depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	public void dados (Conta destino){
		System.out.println(destino.agencia);
		System.out.println(destino.limite);
		System.out.println(destino.senha);
		System.out.println(destino.tipo);
		System.out.println(destino.saldo);
		System.out.println(destino.numero_conta);
	}

}
