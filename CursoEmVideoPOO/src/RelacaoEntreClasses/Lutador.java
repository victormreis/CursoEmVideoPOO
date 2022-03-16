package RelacaoEntreClasses;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura, peso;	
	private String categoria;
	private int vitorias, derrotas, empates;
	
	// construtor
	
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
			int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}			
	
	public void apresentar () {
		System.out.println("Chegou a hora da luta, Apresento o lutador "+this.getNome());
		System.out.println("Ele é do "+this.getNacionalidade());
		System.out.println("Tem "+this.getIdade() + " anos e "+this.getAltura()+" de altura!");
		System.out.println("Pesando "+this.getPeso() + "KG");
		System.out.println("Número de vitorias: "+this.getVitorias());
		System.out.println("Número de derrotas: "+this.getDerrotas());
		System.out.println("Número de empates: "+this.getEmpates());
	}
	
	public void status() {
		System.out.println(this.getNome());
		System.out.println("É um peso "+this.getCategoria());
		System.out.println(this.getVitorias()+" Vitorias");
		System.out.println(this.getDerrotas()+ " Derrotas");
		System.out.println(this.getEmpates()+" Empates");
		
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1);
	}
	
	// Getters and Setters 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();		
	}
	
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(this.peso <52.2) {
			this.categoria = "invalido";
		}else if(this.peso < 70.3) {
			this.categoria = "Leve";
		}else if(this.peso < 83.9) {
			this.categoria = "Médio";
		}else if(this.peso < 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Invalido";
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	

}
