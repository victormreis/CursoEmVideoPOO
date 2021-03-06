package Encapsulamento;

public class ControleRemoto implements Controlador {
	
	//Atributos	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//Construtor
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = true;
		this.tocando = false;
	}
	
	//Getters and Setters	
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	//Metodos 	
	@Override
	public void ligar() {
		this.setLigado(true);
		
	}
	@Override
	public void desligar() {
		this.setLigado(false);
		
	}
	@Override
	public void abrirMenu() {
		if(this.getLigado()) {
			System.out.println("--------MENU----------");
			System.out.println("Est? ligado? "+this.getLigado());
			System.out.println("Est? tocando? "+this.getTocando());
			System.out.print("Volume: "+this.getVolume() + " ");
			for(int i = 0; i <= this.getVolume(); i+=10 ) {
				System.out.print("|");
				
			}
			System.out.println(" ");
		}else
			System.out.println("Impossivel abrir menu enquanto desligado");
		
		
	}
	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");
		
	}
	@Override
	public void maisVolumee() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume()+5);
		}else
			System.out.println("Impossivel aumentar o volume! ");
		
	}
	@Override
	public void meenosVolumeee() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume()-5);
		}else
			System.out.println("Impossivel diminuir o volume! ");
		
	}
	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}else
			System.out.println("Impossivel ativar Mudo");
		
	}
	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() ==0 ) {
			this.setVolume(50);
		}else
			System.out.println("Mudo n?o est? ativo!");
		
	}
	@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
		
		
	}
	@Override
	public void pause() {
		if(this.getLigado()&& this.getTocando()) {
			this.setTocando(false);
		}
		
	}	
	
}
