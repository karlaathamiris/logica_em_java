package questoes;
import java.util.Scanner;

public class FibonacciDoWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int ultimo, penultimo, cont, aux;
		
		ultimo = 1;
		penultimo = 0;
		cont = 0;
		
		do {
			System.out.println(ultimo);
			aux = ultimo;
			ultimo = ultimo + penultimo;
			penultimo = aux;
			cont = cont + 1;
		}while(cont < 10);
		
		ler.close();

	}

}
