package eleicao;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Eleicao {

	static Prefeito cadastrarPrefeito() {
		String PrefeitoNome = JOptionPane.showInputDialog("Digite o nome:");
		String PrefeitoPartido = JOptionPane.showInputDialog("Digite o partido:");
		int PrefeitonumVotos = 0;
		int PrefeitoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número:"));
		Prefeito prefeito1 = new Prefeito(PrefeitoNome, PrefeitoPartido, PrefeitonumVotos, PrefeitoNumero);	
		return prefeito1;
	}
	static Vereador cadastrarVereador() {
		String VereadorNome = JOptionPane.showInputDialog("Digite o nome:");
		String VereadorPartido = JOptionPane.showInputDialog("Digite o partido:");
		int VereadornumVotos = 0;
		int VereadorNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número:"));
		Vereador vereador1 = new Vereador(VereadorNome, VereadorPartido,VereadornumVotos,VereadorNumero);
		return vereador1;
	}
	public static void candidatosPrefeito(ArrayList<Prefeito>ListaPrefeito) {
		int opcaoPrefeito;
		String listaOpcaoPrefeito = "";
		for (Prefeito item : ListaPrefeito) {
			listaOpcaoPrefeito += item.toString()+"\n";
		}
		for (Prefeito prefeito1 : ListaPrefeito) {
			opcaoPrefeito = Integer.parseInt(JOptionPane.showInputDialog(listaOpcaoPrefeito));
			if (opcaoPrefeito == prefeito1.getNumero()) {
				prefeito1.incrementaVotos();
				break;
			}
		}
			
	}
	public static void candidatosVereador(ArrayList<Vereador>ListaVereador) {
		int opcaoVereador;
		String ListaOpcaoVereador = "";
		for (Vereador vereador1 : ListaVereador) {
			ListaOpcaoVereador += vereador1.toString()+"\n";
		}
		for (Vereador vereador2 : ListaVereador) {
			opcaoVereador = Integer.parseInt(JOptionPane.showInputDialog(ListaOpcaoVereador));
			if (opcaoVereador==vereador2.getNumero()) {
				vereador2.incrementaVotos();
				break;
			}
		}	
	}
	public static void prefeitoMaisVotado(ArrayList<Prefeito>ListaPrefeitoMaisVotado){
		Collections.sort(ListaPrefeitoMaisVotado);
		String PrefeitoMaisVotado = "Prefeito mais votado - Nome: "+ ListaPrefeitoMaisVotado.get(0).getNome()+
				". Partido :"+ListaPrefeitoMaisVotado.get(0).getPartido()+
				". Número: "+ListaPrefeitoMaisVotado.get(0).getNumero()+
				". Número de votos: "+ListaPrefeitoMaisVotado.get(0).getNumVotos();
		JOptionPane.showMessageDialog(null, PrefeitoMaisVotado);
	}
	public static void vereadorMaisVotado(ArrayList<Vereador>ListaVereadorMaisVotado){
		Collections.sort(ListaVereadorMaisVotado);
		String VereadorMaisVotado = "Vereador mais votado - Nome: "+ ListaVereadorMaisVotado.get(0).getNome()+
				". Partido :"+ListaVereadorMaisVotado.get(0).getPartido()+
				". Número: "+ListaVereadorMaisVotado.get(0).getNumero()+
				". Número de votos: "+ListaVereadorMaisVotado.get(0).getNumVotos();
		JOptionPane.showMessageDialog(null, VereadorMaisVotado);
	}
	
	public static void main(String[] args) {
		ArrayList <Prefeito> GuardaPrefeito = new ArrayList <> ();
		ArrayList <Vereador> GuardaVereador = new ArrayList <> ();
		int opcaoVotar;
		int opcaoCadastrar;
		do { 
			opcaoCadastrar = Integer.parseInt(JOptionPane.showInputDialog("1 - Para cadastrar Prefeito. \n"
				+ "2 - Para cadastrar Vereador. \n"
				+ "3 - Parar de cadastrar. "));
			switch(opcaoCadastrar) {
			case 1 :
				Prefeito prefeito = cadastrarPrefeito();
				GuardaPrefeito.add(prefeito);
				break;
			case 2 :
				Vereador vereador = cadastrarVereador();
				GuardaVereador.add(vereador);
				break;
			case 3 :
				JOptionPane.showMessageDialog(null, "Você parou de cadastrar.");
				break;
			}
		}while(opcaoCadastrar!=3);
	
		do { 
			opcaoVotar = Integer.parseInt(JOptionPane.showInputDialog("1 - Para votar em Prefeito. \n"
				+ "2 - Para votar em Vereador. \n"
				+ "3 - Para exibir o resultado e sair. "));
			switch(opcaoVotar) {
			case 1 :
				candidatosPrefeito(GuardaPrefeito);
				break;
			case 2 :
				candidatosVereador(GuardaVereador);
				break;
			case 3 :
				prefeitoMaisVotado(GuardaPrefeito);
				vereadorMaisVotado(GuardaVereador);
				JOptionPane.showMessageDialog(null, "Você saiu.");
				break;
			}
		}while(opcaoVotar!=3);	
	}	
}	
