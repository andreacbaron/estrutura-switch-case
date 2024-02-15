package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Problema exemplo:

		// Fazer um programa para ler um valor inteiro de 1 a 7 representado
		// um dia da semana (sendo 1=domingo, 2=segundqa e assim por diante).
		// Escreva na tela o dia da semana corespondente, conforme exemplos.

		// entreda: 1, Saida Domingo
		// entrada 2, Saida Segundo
		// entrada 9 Dia da semana: nválido digite um número de um a 7

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
		System.out.println("Dia da semana: " + dia);
		sc.close();

	}

}
