package eleicao;

public class Prefeito extends Candidato implements Comparable <Prefeito> {
	private int numero;
	static int valorLimiteInferior = 55;
	
	 public Prefeito (String nome, String partido, int numVotos, int numero) {
		 super (nome, partido, numVotos);
		 this.numero = numero;
	 }
	 
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if (numero >= 10 && numero <= 99) {
			this.numero = numero;
		}
		else {
			numero = valorLimiteInferior++;
			this.numero = numero;
		}
	}

	@Override
	public String toString() {
		return "Nome do candidato: " + getNome() + " .Número: " + getNumero() + " .Partido: " + getPartido();
	}

	@Override
	public int compareTo(Prefeito ComparaPrefeito) {
		// TODO Auto-generated method stub
		return (ComparaPrefeito.getNumVotos() - this.getNumVotos());
	}
}
