package ExemploPartico;

import java.util.Scanner;

public class Conta extends Pessoa{
	private String numConta;
	private String tipoConta;	
	private double saldo;
	private boolean aberta;	
	Scanner read = new Scanner(System.in);
			
	
	public void  sacar(double x) {
		if (aberta == true) {
			System.out.println("qual valor deseja sacar: ");
			x = read.nextDouble();
			if(this.saldo>=x) {
				this.saldo -= x;
				System.out.println("Saque efetuado!");
			}
			else
				System.out.println("Saldo insuficiente");
		}else
			System.out.println("Impossivel Sacar antes de abrir uma conta!");
	}
	
	public void depositar(double y) {
		if(aberta == true) {
			System.out.println("qual valor deseja depositar: ");
			y = read.nextDouble();
			this.saldo+= y;
			System.out.println("Deposito efetuado");
		}else
			System.out.println("Impossivel depositar antes de abrir uma conta!");
	}
	
	public void abrirConta(String x, String y) {
		System.out.print("Tipo da conta: ");
		x = read.next();
		System.out.print("Numero da conta: ");
		y = read.next();
		this.setTipoConta(x);
		this.setNumConta(y);
		System.out.println("Conta aberta com sucesso!");
		aberta = true;
		
	}
	
	public void status() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("CPF: "+this.getCpf());
		System.out.println("Tipo de conta: "+this.getTipoConta());
		System.out.println("Numero da conta: "+this.getNumConta());
		System.out.println("Saldo: "+this.getSaldo());
		
	}
	
	
	
	
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public boolean isEstado() {
		return aberta;
	}
	public void setEstado(boolean estado) {
		this.aberta = estado;
	}
	
	
	
}
