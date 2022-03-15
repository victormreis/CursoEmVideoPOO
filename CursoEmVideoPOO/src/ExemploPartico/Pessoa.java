package ExemploPartico;

import java.util.Scanner;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	
	Scanner read = new Scanner(System.in);
	
	public void cadastrar(String a, String b) {
		System.out.print("Nome do cliente: ");
		a = read.next();
		System.out.print("CPF do cliente: ");
		b = read.next();
		this.setNome(a);
		this.setCpf(b);
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
		
}
