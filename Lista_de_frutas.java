package vetoresEarraylist;

import java.util.ArrayList;

public class Lista_de_frutas {

	public static void main(String[] args) {

		ArrayList<String> frutas = new ArrayList<String>();
		frutas.add("Abacaxi");
		frutas.add("Melão");
		frutas.add("Mamão");
		frutas.add("Caqui");
		frutas.add("Tomate");
		frutas.add("Açaí");
		frutas.add("Jaca");
		frutas.add("Abacate");
		frutas.add("Maçã");
		frutas.add("Banana");

		for(String fruta : frutas) {
			System.out.println(fruta + ". ");
		}

		frutas.remove("Caqui");
		frutas.remove("Abacate");
		frutas.remove("Melão");
		frutas.remove("Banana");
		frutas.remove("Tomate");

		for(String fruta : frutas) {
			System.out.println(fruta + ". ");
			System.out.println(frutas.size());
		}
	}
}
