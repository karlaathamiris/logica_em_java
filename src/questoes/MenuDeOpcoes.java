package questoes;
import java.util.Scanner;



public class MenuDeOpcoes {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int escolha;
		double num1, num2, res;
		
		//Mesmo sendo double, usar a v�rgula como separador para casas decimais, pois quando voc� n�o especifica nenhum locale, 
		//� usado o default que est� configurado na JVM (que voc� pode consultar qual � chamando o m�todo Locale.getDefault()).
		//Na minha m�quina, por exemplo, o default � pt_BR (portugu�s do Brasil), e o separador decimal � a v�rgula (ent�o este
		//c�digo s� funciona se eu digitar, por exemplo, 3,92).
		
		System.out.print("Menu de op��es\n \n1.Somar dois n�meros\n \n2.Quadrado do n�mero\n \n\nDigite a op��o desejada: ");
		escolha = ler.nextInt();
		
		
		switch (escolha){
		case 1: 
			System.out.print("O valor do primeiro n�mero �: ");
			num1 = ler.nextDouble();
			System.out.print("O valor do segundo n�mero �: ");
			num2 = ler.nextDouble();
			res = num1 + num2;
			System.out.print("\nA soma dos dois n�meros �= " + res); 
				break;
		
		case 2: 
			System.out.print("Me diga um n�mero: ");
			num1 = ler.nextDouble();
			res = num1 * num1;
			System.out.print("\nO quadrado desse n�mero �: " + res);
				break;
				
		default: 
			System.out.println("Op��o inv�lida");
		}
		
		ler.close();
	}
	
}
