package questoes;
import java.util.Scanner;

public class PlacaDetran {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int placa;
		String mesVistoria = null; 
		
		System.out.println("\nNesse programa você deve inserir um número inteiro de quatro dígitos para que ele "
				+ "retorne quando será feita a vistoria do seu veículo\n");
		
		do {
		System.out.println("Digite aqui somente os números da placa de seu veículo: ");
		placa = ler.nextInt();
		
		} while (placa < 1000 || placa > 9999);
		
		switch (placa % 10) {
			case 0 : mesVistoria = "janeiro do ano que vem";
				break;
			case 1 : mesVistoria = "fevereiro do ano que vem"; 
				break;
			case 2 : mesVistoria = "março do ano que vem"; 
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
		
		System.out.println("A vistoria será em "+ mesVistoria);
		ler.close();
	}

}
