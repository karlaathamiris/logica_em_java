public class Exercicio1 {
	public static void main(String[] args) {
        int numero;
        
        numero = 4;
		while(numero % 4 == 0 && numero < 200) {
			System.out.println(numero);
			numero = numero + 4;
		}
	}
}
