package questoes;
import java.util.Scanner;

public class ViagemCarroPart2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numeroViag, litrosCombs, distPerc, somaLitros = 0, somaDist = 0;
		double consMedio;

		System.out.print("Informe quantas viagens foram feitas: ");
		numeroViag = ler.nextInt();
		
		for (int i = 0; i < numeroViag; i++){
			System.out.print("Quantos litros de gasolina usaste nesta viagem? ");
			litrosCombs = ler.nextInt();
			System.out.print("Quantos km percorridos? ");
			distPerc = ler.nextInt();
			somaLitros += litrosCombs;
			somaDist += distPerc;
		} 
		consMedio = (double) somaDist / somaLitros;
		System.out.println("O consumo médio do carro é de " +consMedio+" km/litro");

		ler.close();
	}

}
