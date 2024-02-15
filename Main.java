package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Que dia da semana e hj digite número");
		int x = sc.nextInt();

		String dia;

		switch (x) { // e baseado em um valor de uma expresão, neste caso e o x
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-feira";
			break;
		case 3:
			dia = "Terça-feira";
			break;
		case 4:
			dia = "Quarta-feira";
			break;
		case 5:
			dia = "Quinta-feira";
			break;
		case 6:
			dia = "Sexta-feira";
			break;
		case 7:
			dia = "Sabádo";
			break;
		default:
			dia = "inválido digite um número de um a 7";

		}
		System.out.println("Dia da semana " + dia);
		sc.close();

	}

}
