package br.etec.bean;



public class Programa {
	public static void main(String[] args) {
		Cliente meucliente = new Cliente("01234567891","393934287");
		Conta minhaconta = new Conta (meucliente);
		minhaconta.Titular = meucliente;
		System.out.println(minhaconta);
		minhaconta.Titular.setNome("Rafael");
		minhaconta.setAgencia(1998);
		minhaconta.setLimite(5000000);
		minhaconta.setLimite(123456);
		minhaconta.setTipo("Salário");
		minhaconta.Depositar(1000);
		minhaconta.setSenha(2014);
		System.out.println("saldo conta 1 " + minhaconta.getSaldo());
		
		minhaconta.dados(minhaconta);
		
		Cliente meucliente2 = new Cliente("01234567891","393934287");
	    Conta minhaconta2 = new Conta (meucliente2);
	    minhaconta2.Titular = meucliente2;
	    minhaconta2.Titular.setNome("Raphael");
		minhaconta2.setAgencia(1998);
		minhaconta2.setLimite(5000000);
		minhaconta2.setNumero_conta(123456);
		minhaconta2.setTipo("Salário");
		minhaconta2.Depositar(0);
		minhaconta2.setSenha(2014);
		
	   minhaconta.Depositar(100);
	   System.out.println(minhaconta.getSaldo());
	   
	   boolean resp = minhaconta.Sacar(100);
	   if (resp == true){
		   System.out.println("Saque realizado com sucesso");
		   
	   }else{
		   System.out.println("Dinheiro em conta insuficiente");
	   }
	   System.out.println("Saldo após o saque" + minhaconta.getSaldo());
	   
	   System.out.println("Sando conta 1: " + minhaconta.getSaldo());
	   System.out.println("Sando conta 2: " + minhaconta2.getSaldo());
	   
	   boolean resposta = minhaconta.Transferir(100, minhaconta2);
	   if (resposta == true){
		   System.out.println("Transferencia realizada com sucesso");
	   }else{
		   System.out.println("Transferencia não realizada");
	   }
	   System.out.println("Sando conta 1: " + minhaconta.getSaldo());
	   System.out.println("Sando conta 2: " + minhaconta2.getSaldo());
	}

}
