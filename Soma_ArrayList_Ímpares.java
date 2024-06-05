package vetoresEarraylist;

import java.util.ArrayList;

public class Soma_ArrayList_Ímpares {

	public static void main(String[] args) {
		int soma = 0;
		ArrayList<Integer> numeros = new ArrayList<>();

		numeros.add(1);
		numeros.add(15);
		numeros.add(10);
		numeros.add(8);
		numeros.add(9);

		for (int i  : numeros) {

			if(i % 2 == 1) {
				soma += i;
			}
		}
		System.out.println("A soma dos números ímpares é: " + soma);
	}
}

