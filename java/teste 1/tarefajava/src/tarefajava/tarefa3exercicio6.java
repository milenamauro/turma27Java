/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado. 
E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/


package tarefajava;

import java.util.Scanner;

public class tarefa3exercicio6 {

	public static void main(String[] args) {

		Scanner reader = new Scanner (System.in);
		
		int numero = 0, media = 0, contador = 0;
		
		do {
			System.out.println("Digite um n�mero, para parar e exibir o resultado digite \"0\"");
			numero = reader.nextInt();
			if (numero % 3 == 0) {
				media += numero;
				contador++;
			}
		} while (numero != 0);
		
		media = media / contador;
		
		System.out.println("M�dia de todos os n�meros m�ltiplos de 3 digitados: " + media);
	}

}