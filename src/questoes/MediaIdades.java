public class MediaIdades {
    public static void main(String[] args) {
	
		int idade, somaIdade = 0, cont = 0; 
		double media;

		do {
			System.out.print("Digite uma idade: ");
			idade = Integer.parseInt(System.console().readLine());
			cont++;
			somaIdade += idade;

		} while (idade != 0);
		
		media = (double) somaIdade / cont;
		System.out.print("A média das idades é: " +media);
		
	}
}
