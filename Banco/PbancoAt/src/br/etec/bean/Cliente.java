package br.etec.bean;

import javax.xml.crypto.Data;

public class Cliente {
private String Nome;
private String Endereco;
private String Numero_End;
private String Bairro;
private String Cidade;
private String UF;
private String CEP;
private String Referencia_End;
private String CPF;
private String RG;
private String Email;
private Data Data_nasc;

public Cliente(String Novo_CPF, String Novo_RG) {
	// TODO Auto-generated constructor stub
	this.CPF = Novo_CPF;
	this.RG = Novo_RG; 
}

public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	Nome = nome;
}
public String getEndereco() {
	return Endereco;
}
public void setEndereco(String endereco) {
	Endereco = endereco;
}
public String getNumero_End() {
	return Numero_End;
}
public void setNumero_End(String numero_End) {
	Numero_End = numero_End;
}
public String getBairro() {
	return Bairro;
}
public void setBairro(String bairro) {
	Bairro = bairro;
}
public String getCidade() {
	return Cidade;
}
public void setCidade(String cidade) {
	Cidade = cidade;
}
public String getUF() {
	return UF;
}
public void setUF(String uf) {
	UF = uf;
}
public String getCEP() {
	return CEP;
}
public void setCEP(String cep) {
	CEP = cep;
}
public String getReferencia_End() {
	return Referencia_End;
}
public void setReferencia_End(String referencia_End) {
	Referencia_End = referencia_End;
}
public String getCPF() {
	return CPF;
}
public void setCPF(String cpf) {
	CPF = cpf;
}
public String getRG() {
	return RG;
}
public void setRG(String rg) {
	RG = rg;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public Data getData_nasc() {
	return Data_nasc;
}
public void setData_nasc(Data data_nasc) {
	Data_nasc = data_nasc;
}

}
