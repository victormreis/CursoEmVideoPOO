package Aula02;

public class Celular {
	private String modelo;
	private String cor;
	private int bateria;
	private boolean ligado;
	
	
	public Celular(String modelo, String cor, int bat ) {
		this.modelo = modelo;
		this.cor = cor;
		this.bateria = bat;
		ligado = true;
	}
	
	void status () {
		System.out.println("Celular modelo: "+this.modelo );
		System.out.println("Cor: "+this.cor);
		System.out.println("Bateria: "+this.bateria+"%");
		System.out.println("Esta ligado: "+this.ligado);
	}
	
	void ligar () {
		this.ligado = true;
	}
	
	void desligar() {
		this.ligado = false;
		
	}
	
	void fazerLigacao() {
		if(this.ligado == true && this.bateria > 0)
			System.out.println("Fazendo liga??o");
		else
			System.out.println("Erro celular est? desligado!");
	}
	
	void menosBateria () {
		this.bateria--;
	}
	void maisBateria() {
		this.bateria++;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	
}
