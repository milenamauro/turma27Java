  
/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/

package tarefajava;

import java.util.Scanner;

public class tarefa3Exercicio5 {
		public static void main (String[] args) {
			
			Scanner reader = new Scanner (System.in);
			
			double numero = 0.0, soma = 0.0;
			
			do {
				System.out.println("Digite um n�mero, para parar e exibir o resultado digite \"0\"");
				numero = reader.nextDouble();
				soma += numero;
			}while(numero != 0);
			
			System.out.println("Soma de todos os n�meros digitados: " + soma);
		}
	}