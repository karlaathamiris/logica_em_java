package questoes;
import java.util.Scanner;

public class SenhaUsuario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int senha;
		
		do {
			System.out.println("Digite a senha: ");
			senha = ler.nextInt();
		}while(senha != 1234);
		
		System.out.print("Senha correta, acesso liberado.");
		ler.close();
	}
}
