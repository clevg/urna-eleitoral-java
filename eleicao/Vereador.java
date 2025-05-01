package eleicao;

public class Vereador extends Candidato implements Comparable <Vereador>{
	private int numero;
	static int valorLimiteInferior = 50035;
	
	public Vereador (String nome, String partido, int numVotos, int numero) {
		super (nome, partido, numVotos);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if (numero >= 10000 && numero <= 99999) {
			this.numero = numero;
		}
		else {
			numero = valorLimiteInferior++;
			this.numero = numero;
		}
	}
	@Override
	public String toString() {
		return "Nome do candidato:" + getNome() + " .Número: " + getNumero() + " .Partido: " + getPartido();
	}

	@Override
	public int compareTo(Vereador ComparaVereador) {
		return ComparaVereador.getNumVotos() - this.getNumVotos();
	}
}

