package Aula02;

public class Aula02 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.setCor("Azul");
		c1.modelo = "Bic";
		c1.carga = 100;
		c1.ponta = 0.5;
		
		
		c1.status();
		c1.rabiscar();
		c1.tampar();
		c1.status();
		c1.rabiscar();
	}

}
