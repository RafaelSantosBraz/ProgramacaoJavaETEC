package br.etec.Primeiro_Exercicio;

public class Chefe extends Empregado{
	
	private String Departamento_Responsavel;

	public String getDepartamento_Responsavel() {
		return Departamento_Responsavel;
	}

	public void setDepartamento_Responsavel(String departamento_Responsavel) {
		Departamento_Responsavel = departamento_Responsavel;
	}
	
	public void Mostrar_Dados(){
		Mostrar_Dados_Empregado();
		System.out.println(getDepartamento_Responsavel());
	}
	
}
