package vetoresEarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Escolha_de_carros {

	public static void main(String[] args) {

		ArrayList <String> carros = new ArrayList<String>();

		int numero;

		Scanner ler = new Scanner(System.in);

		carros.add("Fusca");
		carros.add("Brasília");
		carros.add("Chevete");
		carros.add("Monza");
		carros.add("Onix");
		carros.add("Prisma");
		carros.add("Kwid");
		carros.add("Gol");
		carros.add("Palio");
		carros.add("Ford Ka");

		for(String carro : carros) {
			System.out.println(carro + ". ");

		}

		System.out.println("Qual carro gostaria de escolher de 0 a 9?");
		numero = ler.nextInt();

		if (numero == 0) {
			System.out.println("Fusca");
		}
		if (numero == 1) {
			System.out.println("Brasília");
		}
		if (numero == 2) {
			System.out.println("Chevete");
		}
		if (numero == 3) {
			System.out.println("Monza");
		}
		if (numero == 4) {
			System.out.println("Onix");
		}
		if (numero == 5) {
			System.out.println("Prisma");
		}
		if (numero == 6) {
			System.out.println("Kwid");
		}
		if (numero == 7) {
			System.out.println("Gol");
		}
		if (numero == 8) {
			System.out.println("Palio");
		}
		if (numero == 9) {
			System.out.println("Ford Ka");
		}
	}
}
