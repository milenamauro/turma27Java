package tarefajava;
import java.util.Scanner;

public class tarefa2execicio4 {
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			int numero;
			
			System.out.println("Digite um numero par ou impar: ");
			numero = leia.nextInt();
			
			if(numero%2==0) {
				System.out.println(numero+" � par! e a raiz quadrada desse n�mero �: "+Math.sqrt(numero));	
			}
			if(numero%2==1) {
				System.out.println(numero+" � �mpar! e esse n�mero elevado ao quadrado �: "+Math.pow(numero, 2));
			}
		}
}
 