package Heranca;

public class Main {

	public static void main(String[] args) {

		Visitante v1 = new Visitante();
		Aluno a1 = new Aluno();
		Bolsista b1 = new Bolsista();

		v1.setNome("Victor");
		v1.setIdade(27);
		v1.setSexo("M");
		a1.setNome("Monica");
		a1.setIdade(25);
		a1.setSexo("F");
		b1.setNome("Daiane");
		b1.setIdade(24);
		b1.setSexo("F");
		b1.setMatricula(100298);
		
		a1.pagarMensalidade();
		b1.pagarMensalidade();

		System.out.println(b1.toString());

	}

}
