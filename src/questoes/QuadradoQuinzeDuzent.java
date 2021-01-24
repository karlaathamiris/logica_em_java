public class QuadradoQuinzeDuzent {
    public static void main(String[] args) {
		int numero, quad;
		
		System.out.println("Este programa mostra os quadrados dos numeros inteiros de 15 a 200.\n");
		
		numero = 15;
		while(numero <= 200) {
			quad = numero * numero;
			System.out.printf("%d ao quadrado = %d\n", numero, quad);
			numero++ ;
		}
	}
}
