package tarefajava;
/*2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/

public class exercicio4tarefa2 {
	public static void main(String[] args) {

		double numeros[] = new double[10];
		double media = 0, maiorValor = 0;
		int contador =  0;
		
		for (int i = 0; i < 10; i++){
			numeros[i] = Math.random() * 10;
			
			media += numeros[i];
			System.out.printf("Posi��o %d: %.2f \n", (i+i), numeros[i]);
			if (numeros[i] > maiorValor){
				maiorValor = numeros[i];
			}
		}
		
		media /= 10;
		
		for (int i = 0; i < 10; i++){
			if (numeros[i] == maiorValor){
				contador++;
			}
		}

		System.out.printf("\nM�dia = %.2f \nMaior n�mero: %.2f ocorr�ncias: %d", media, maiorValor, contador);
		
	}

}