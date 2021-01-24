public class ConsumoCombustivel {
    public static void main(String[] args) {
		int numeroViag, litrosCombs, distPerc, somaLitros = 0, somaDist = 0;
		double consMedio;

		System.out.print("Informe quantas viagens foram feitas: ");
		numeroViag = Integer.parseInt(System.console().readLine());
		
		for (int i = 0; i < numeroViag; i++){
			System.out.print("Quantos litros de gasolina usaste nesta viagem? ");
			litrosCombs = Integer.parseInt(System.console().readLine());
			System.out.print("Quantos km percorridos? ");
			distPerc = Integer.parseInt(System.console().readLine());
			somaLitros += litrosCombs;
			somaDist += distPerc;
		} 
		consMedio = (double) somaDist / somaLitros;
		System.out.println("O consumo médio do carro é de " +consMedio+" km/litro");
	}
}
