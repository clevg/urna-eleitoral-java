package eleicao;

public class Candidato {
	
	private String nome;
	private String partido;
	private int numVotos;
	
	public Candidato(String nome, String partido, int numVotos) {
		this.nome = nome;
		this.partido = partido;
		this.numVotos = numVotos;
	}
	
	public void incrementaVotos() {
		this.numVotos++;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	
	public int getNumVotos() {
		return numVotos;
	}
	public void setNumVotos(int numVotos) {
		this.numVotos = numVotos;
	}
	
}
