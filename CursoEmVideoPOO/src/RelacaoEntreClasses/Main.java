package RelacaoEntreClasses;

public class Main {

	public static void main(String[] args) {
		Lutador l[] = new Lutador [6];
		l[0] = new Lutador ("Charles do Bronks", "Brasil", 35, 1.75, 71.2, 13,1,0);
		l[1] = new Lutador ("Mc Gregor", "USA", 28, 1.81, 72.5, 10,2,1);		
		l[2] = new Lutador ("Johnny Walker", "Brasil", 27, 1.56, 62.2, 12,1,0);
		l[3] = new Lutador ("Jon Jones", "USA", 28, 1.98, 93.7, 8,0,2);		
		l[4] = new Lutador ("Amanda Nunes", "Brasil", 33, 1.73, 61.9, 11,3,2);
		l[5] = new Lutador ("Miesha Tate", "USA", 35, 1.68, 61.2, 10,3,0);
		
		Luta ufc01 = new Luta();
		Luta ufc02 = new Luta();
		ufc01.marcarLuta(l[0], l[1]);
		ufc01.lutar();
		
		l[0].status();
		l[1].status();
		
		ufc02.marcarLuta(l[4], l[5]);
		ufc02.lutar();
		
		
		
		
		

	}

}
