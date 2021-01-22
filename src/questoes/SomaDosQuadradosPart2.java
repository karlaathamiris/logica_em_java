package questoes;
import java.util.Scanner;

public class SomaDosQuadradosPart2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int soma, n, somaQuad;
		double media;
		
		System.out.println("\nEste programa calcula a soma, a soma dos quadrados e a média dos N primeiros números positivos.\n");
        System.out.print("Digite o valor de N: ");
        n = ler.nextInt();
        
        soma = 0;
        somaQuad = 0;
        
        for (int i = 1; i <= n; i++) {
        	soma += i;
        	somaQuad += i * i;
	}
        media = (double)soma / n;
        
        System.out.printf("A soma dos números= %d\n", soma);
        System.out.printf("A soma dos quadrados dos números= %d\n", somaQuad);
        System.out.printf("E a média entre os números= %.2f\n", media);
        
        ler.close();
	}
}