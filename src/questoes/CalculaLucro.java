public class CalculaLucro {
    public static void main(String[] args) {
		int numIngressos;
		double precoIngresso, lucro;
		
		precoIngresso = 5.00;

		numIngressos = 120;
		while(precoIngresso >= 1.00) {
			lucro = precoIngresso * numIngressos - 200;
			System.out.printf("Preco = R$ %.2f (%d ingressos) -> Lucro de R$ %.2f\n", precoIngresso, numIngressos, lucro);
			precoIngresso = precoIngresso - 0.50;
			numIngressos = numIngressos + 26;
		}
	}
}

