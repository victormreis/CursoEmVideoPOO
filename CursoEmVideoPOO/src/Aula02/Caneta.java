package Aula02;

public class Caneta {
	private String cor;
	String modelo;
	double ponta;
	boolean tampada;
	int carga; 
	
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar () {
		this.tampada = false;
	}
	
	void rabiscar() {
		if(this.tampada == true) {
			System.out.println("Erro caneta tampada!");
		}else
			System.out.println("rabiscando");
	}
	
	
	void status () {
		System.out.println("Caneta "+this.cor);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Carga: "+this.carga + "%");
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Est? tampada: "+this.tampada);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
		

}
