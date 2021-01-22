package questoes;
import java.util.Scanner;

public class PlacaDetran {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int placa;
		String mesVistoria = null; 
		
		System.out.println("\nNesse programa voc� deve inserir um n�mero inteiro de quatro d�gitos para que ele "
				+ "retorne quando ser� feita a vistoria do seu ve�culo\n");
		
		do {
		System.out.println("Digite aqui somente os n�meros da placa de seu ve�culo: ");
		placa = ler.nextInt();
		
		} while (placa < 1000 || placa > 9999);
		
		switch (placa % 10) {
			case 0 : mesVistoria = "janeiro do ano que vem";
				break;
			case 1 : mesVistoria = "fevereiro do ano que vem"; 
				break;
			case 2 : mesVistoria = "mar�o do ano que vem"; 
				break;
			case 3 : mesVistoria = "abril do ano que vem"; 
				break;
			case 4 : mesVistoria = "maio do ano que vem"; 
				break;
			case 5 : mesVistoria = "junho do ano que vem"; 
				break;
			case 6 : mesVistoria = "setembro desse ano"; 
				break;
			case 7 : mesVistoria = "outubro desse ano";
				break;
			case 8 : mesVistoria = "novembro desse ano"; 
				break;
			case 9 : mesVistoria = "dezembro desse ano"; 
				break;
		}
		
		System.out.println("A vistoria ser� em "+ mesVistoria);
		ler.close();
	}

}
