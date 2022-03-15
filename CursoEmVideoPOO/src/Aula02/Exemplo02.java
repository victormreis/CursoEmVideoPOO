package Aula02;

public class Exemplo02 {

	public static void main(String[] args) {
		Celular c1 = new Celular("Motorola", "Preto", 100);
		Celular c2 = new Celular("Samsung", "Dourado", 1);
		
		c2.menosBateria();
		c1.fazerLigacao();
		c2.fazerLigacao();

	}

}
