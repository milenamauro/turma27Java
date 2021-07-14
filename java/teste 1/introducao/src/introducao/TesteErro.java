package introducao;

import java.util.Scanner;

public class TesteErro {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int valor;
		String nome[] = new String[3];
		
		try {
		System.out.println("Digite a posi��o do vetor de 0 a 8 para cadrato do nome:  ");
		valor = leia.nextInt();
		System.out.println("Digite o nome da pessoa em quest�o:  ");
		nome[valor] = leia.next();
		
	} catch (java.lang.ArrayIndexOutOfBoundsException erro) {
		System.out.println("Vc colocou um tamanho errado ou posi��o incorreta");
	}
		
	}

}
