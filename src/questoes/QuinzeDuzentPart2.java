package questoes;
import java.util.Scanner;

public class QuinzeDuzentPart2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
int numero, quad;
		
		System.out.println("\nEste programa mostra os quadrados dos numeros inteiros de 15 a 200.\n");
		
		numero = 15;
		while(numero <= 200) {
			quad = numero * numero;
			System.out.printf("%d ao quadrado = %d\n", numero, quad);
			numero++ ;
		}
		ler.close();
	}

}
