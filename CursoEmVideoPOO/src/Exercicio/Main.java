package Exercicio;

public class Main {

	public static void main(String[] args) {
		Pessoa [] p  = new Pessoa[2];
		Livro [] l = new Livro[3];		
		p[0] = new Pessoa("Vicotr", 27, "Masculino");
		p[1] = new Pessoa ("Daiane", 24, "Feminino");
		l[0] = new Livro ("Aprendendo Java", "Jos? da Silva", 300 , p[0]);
		l[1] = new Livro ("Pilares de POO", "Armando Cruz", 188 , p[1]);
		l[2] = new Livro ("Clean Code", "Danilo Silva", 480 , p[1]);
		
		l[0].abrir();
		l[0].folhear(15);
		l[0].avancarPagina();
		System.out.println(l[0].detalhes());
		System.out.println("\n");
		System.out.println(l[1].detalhes());

	}

}
