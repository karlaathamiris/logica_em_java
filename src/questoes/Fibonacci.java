public class Fibonacci {
    public static void main(String[] args) {
		int cont, penultimo, ultimo, aux;
				
		penultimo = 0;
		ultimo = 1;
		cont = 0;
		while(cont < 10)  {
			System.out.println(ultimo);
			aux = ultimo;
			ultimo = ultimo + penultimo;
			penultimo = aux;
			cont = cont + 1;
		}
	}
}
