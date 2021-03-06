package Heranca;

public class Bolsista extends Aluno // Classe filha de aluno e neta de pessoa
{
	private int bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de "+ this.getNome());
	}
	
	@Override  // sobreescrevendo o metodo herdado da classe aluno 
	public final void pagarMensalidade()  // Transformando metodo em final para que nao possa mais ser sobreescrito
	{
		System.out.println(this.getNome() + " ? Bolsista!");
	}

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
		

}
