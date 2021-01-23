package questoes;
import java.util.Scanner;



public class MenuDeOpcoes {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int escolha;
		double num1, num2, res;
		
		//Mesmo sendo double, usar a vírgula como separador para casas decimais, pois quando você não especifica nenhum locale, 
		//é usado o default que está configurado na JVM (que você pode consultar qual é chamando o método Locale.getDefault()).
		//Na minha máquina, por exemplo, o default é pt_BR (português do Brasil), e o separador decimal é a vírgula (então este
		//código só funciona se eu digitar, por exemplo, 3,92).
		
		System.out.print("Menu de opções\n \n1.Somar dois números\n \n2.Quadrado do número\n \n\nDigite a opção desejada: ");
		escolha = ler.nextInt();
		
		
		switch (escolha){
		case 1: 
			System.out.print("O valor do primeiro número é: ");
			num1 = ler.nextDouble();
			System.out.print("O valor do segundo número é: ");
			num2 = ler.nextDouble();
			res = num1 + num2;
			System.out.print("\nA soma dos dois números é= " + res); 
				break;
		
		case 2: 
			System.out.print("Me diga um número: ");
			num1 = ler.nextDouble();
			res = num1 * num1;
			System.out.print("\nO quadrado desse número é: " + res);
				break;
				
		default: 
			System.out.println("Opção inválida");
		}
		
		ler.close();
	}
	
}
