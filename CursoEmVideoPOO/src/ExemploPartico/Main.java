package ExemploPartico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int opc = 99;
		Conta c1 = new Conta();
		
		
		
		
		while(opc != 4) {
			System.out.println("Escolha uma op??o [1]Abrir Conta [2]Sacar [3] Depositar [4] Sair");
			opc = read.nextInt();
			switch(opc) {
			case  1:
				c1.cadastrar(null, null);
				c1.abrirConta(null, null);				
				break;
			case 2: 
				c1.sacar(opc);
				break;
				
			case 3:
				c1.depositar(opc);
				break;
		}
		
		
		
		}
		System.out.println("Obrigado por usar os caixas VtxCapital");
		read.close();
		c1.status();
	}

}
