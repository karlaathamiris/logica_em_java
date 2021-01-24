public class ConsumoEnergia {
    public static void main(String [] args) {
        double salMinimo, kwCons, kwValor, valorPago, pgmtoDescon;
        System.out.println("Digite o valor do salário mínimo: ");
        salMinimo = Double.parseDouble(System.console().readLine());
        System.out.println("Digite o valor de quantidades de quilowatts consumidos: ");
        kwCons = Double.parseDouble(System.console().readLine());
        kwValor = 0.2 * salMinimo;
        valorPago = kwCons * kwValor;
        pgmtoDescon = valorPago - (valorPago * 0.15);
        System.out.printf("O valor de cada kW é: %.2f\n", kwValor);
        System.out.printf("O valor pela residência é: %.2f\n", valorPago);
        System.out.printf("O valor a ser pago com 15%% de desconto é: %.2f", pgmtoDescon);
    }
}
