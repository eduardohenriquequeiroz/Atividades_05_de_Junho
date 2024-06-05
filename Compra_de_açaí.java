package vetoresEarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Compra_de_açaí {

	public static void main(String[] args) {

		ArrayList <String> ingredientes = new ArrayList<String>();

		int numero;

		Scanner ler = new Scanner(System.in);

		ingredientes.add("Banana");
		ingredientes.add("Granola");
		ingredientes.add("Leite condensado");
		ingredientes.add("Leite em pó");
		ingredientes.add("Frutas variadas");
		ingredientes.add("Chocolate");
		ingredientes.add("Doces e balas");
		ingredientes.add("Mousse");
		ingredientes.add("Paçoca");
		ingredientes.add("Sucrilhos");

		for(String ingrediente : ingredientes) {
			System.out.println(ingrediente + ". ");
		}

		System.out.println("Qual ingrediente gostaria de escolher? "
				+ "se resolver adicionar um item digite de 0 a 9."
				+ " Se não for adicionar um item digite 10. Se optar"
				+ " pelo açaí da casa então digite 11: ");
		numero = ler.nextInt();

		if (numero == 0) {
			System.out.println("Adicionado banana ao seu açaí");
		}
		if (numero == 1) {
			System.out.println("Adicionado granola ao seu açaí");
		}
		if (numero == 2) {
			System.out.println("Adicionado leite condensado ao seu açaí");
		}
		if (numero == 3) {
			System.out.println("Adicionado leite em pó ao seu açaí");
		}
		if (numero == 4) {
			System.out.println("Adicionado frutas variadas ao seu açaí");
		}
		if (numero == 5) {
			System.out.println("Adicionado chocolate ao seu açaí");
		}
		if (numero == 6) {
			System.out.println("Adicionado doces e balas ao seu açaí");
		}
		if (numero == 7) {
			System.out.println("Adicionado mousse ao seu açaí");
		}
		if (numero == 8) {
			System.out.println("Adicionado paçoca ao seu açaí");
		}
		if (numero == 9) {
			System.out.println("Adicionado sucrilhos ao seu açaí");
		}
		if (numero == 10) {
			System.out.println("Qual item gostaria de remover de 0 a 9: ");
			numero = ler.nextInt();
			ingredientes.remove(numero);
			System.out.println(ingredientes);
		}
		if (numero == 11) {
			System.out.println("Açaí da casa escolhido com sucesso");
		}
	}
}

