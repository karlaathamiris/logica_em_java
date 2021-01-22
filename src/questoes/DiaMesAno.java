package questoes;
import java.util.Scanner;

public class DiaMesAno {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int dia, mes, ano;
		String nomeMes = "";
		
		do {
            System.out.println("Insira o dia: ");
            dia = ler.nextInt();

        } while (dia <= 0 || dia > 31);

        do {
            System.out.println("Insira o número do mês: ");
            mes = ler.nextInt();

        } while (!(mes > 0 && mes <= 12));

        System.out.println("Insira o ano: ");
        ano = ler.nextInt();

        switch (mes) {
            case 1: nomeMes = "janeiro";
                break;
            case 2: nomeMes = "fevereiro";
                break;
            case 3: nomeMes = "março";
                break;
            case 4: nomeMes = "abril";
                break;
            case 5: nomeMes = "maio";
                break;
            case 6: nomeMes = "junho";
                break;
            case 7: nomeMes = "julho";
                break;
            case 8: nomeMes = "agosto";
                break;
            case 9: nomeMes = "setembro";
                break;
            case 10: nomeMes = "outubro";
                break;
            case 11: nomeMes = "novembro";
                break;
            case 12: nomeMes = "dezembro";
                break;
            default: System.out.print("Esse mês não existe, tente novamente (:");
        	}
        
        ler.close();
        
        System.out.printf("\nA data é: %d de %s de %d\n", dia, nomeMes, ano);
	}

}
