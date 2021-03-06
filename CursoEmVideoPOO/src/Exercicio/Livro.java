package Exercicio;

public class Livro implements Publicacao{
	private String titul;
	private String autor;
	private int totPaginas;
	private int paginaAtual;
	private boolean aberto;
	private Pessoa leitor;	
	
	public Livro(String titul, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.titul = titul;
		this.autor = autor;
		this.aberto = false;
		this.paginaAtual = 0;
		this.totPaginas = totPaginas;
		this.leitor = leitor;
	}
	
	public String detalhes () {
		return "Livro:  " + titul + ",\nautor: " + autor + ",\ntotPaginas: " + totPaginas + ",\npaginaAtual: "
				+ paginaAtual + ",\naberto: " + aberto + ",\nleitor: " + leitor.getNome();
	}

	public String getTitul() {
		return titul;
	}

	public void setTitul(String titul) {
		this.titul = titul;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPaginaAtual() {
		return paginaAtual;
	}

	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}

	public boolean isAberto() {
		return aberto;
	}
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.aberto = true;		
	}

	@Override
	public void fechar() {		
		this.aberto = false;
	}

	@Override
	public void folhear(int p) {
		this.paginaAtual = p ;		
	}

	@Override
	public void avancarPagina() {
		this.paginaAtual++;		
	}

	@Override
	public void voltarPagina() {		
		this.paginaAtual--;
	}	
}
