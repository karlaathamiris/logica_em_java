public class FaturamentoArmazem {
    public static void main(String[] args) {
		int numMercadorias, quantVendida, cont;
		//String nome;
		double precoUnit, fatTotal;
		
		System.out.println("Este programa calcula o faturamento total de um armazem, somando o faturamento de cada produto.\n");
		
		System.out.print("Digite a quantidade de mercadorias: ");
		numMercadorias = Integer.parseInt(System.console().readLine());
		
		fatTotal = 0;
		cont = 0;
		while(cont < numMercadorias) {
			System.out.printf("\n--- MERCADORIA %02d ---\n", cont+1);
			System.out.print("Nome: ");
			//nome = System.console().readLine();
			System.out.print("Preco Unitario: ");
			precoUnit = Double.parseDouble(System.console().readLine());
			System.out.print("Quantidade Vendida: ");
			quantVendida = Integer.parseInt(System.console().readLine());
			
			fatTotal = fatTotal + precoUnit * quantVendida;
			cont = cont + 1;
		}
		
		System.out.printf("\nFATURAMENTO TOTAL DO ARMAZEM = R$ %.2f\n", fatTotal);
	}
}
