package tarefajava;
import java.util.Scanner;

public class tarefa1Exercico1 {
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			int dias,meses,anos,idade,idadeemDias;
			
			System.out.println("Digite a sua idade(apenas o dia em que nasceu)");
			dias = leia.nextInt();
			System.out.println("Digite a sua idade(apenas o m�s em que nasceu)");
			meses = leia.nextInt();
			System.out.println("Digite a sua idade(apenas o ano em que nasceu)");
			anos = leia.nextInt();
			
			idade = 2021 - anos;
			
			idadeemDias = (idade*365) + dias + (meses*30);
			System.out.println("Voc� tem "+idadeemDias+" dias de vida.");
		}
}