package tarefajava;

import java.util.Scanner;

//*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba 
	// se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada
	//do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.

public class tarefa2exercicio4 {
   public static void main(string[] args) {
	   Scanner read=new Scanner (System.in);
	   int numero;
	   
	   System.out.println("digite um n�mero:  \n");
	   numero=read.nextInt();
	   if ((numero%2)==0)
		   Sytem.out.printf("O numero � par e sua ra�z quadrada �: %.2f/n", Math.sqrt(numero,2))
	   
   }
   else {
	   Sytem.out.printf("O numero � imppar e seu quadrado �: %.2f/n", Math.pow(numero,2))
	   
	   
   }
   
   
   
	 
	 
	
	 
}
