package questoes;
import java.util.Scanner;

public class SomaDezValoresPart2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double num, soma = 0;
		
		for (int cont = 0;  cont < 10; cont++) {
			System.out.println("Escreva o numeral inteiro desejado: ");
			num = ler.nextInt();
			
			soma += num;
			
		}
		
		System.out.println("A soma dos 10 números é: " + soma); 
		ler.close();
	}
}