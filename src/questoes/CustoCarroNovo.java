public class CustoCarroNovo {
    public static void main(String [] args) {
        double precoFabri, precenLucro, percenImp, lucroDistri, valorImp, precoFinal;
        System.out.println("Digite o preço de fábrica: ");
        precoFabri = Double.parseDouble(System.console().readLine());
        System.out.println("Digite o percentual de lucro do distribuidor:");
        precenLucro = Double.parseDouble(System.console().readLine());
        System.out.println("E agora informe o percentual de impostos: ");
        percenImp = Double.parseDouble(System.console().readLine());
        lucroDistri = precoFabri * precenLucro / 100;
        valorImp = precoFabri * percenImp / 100;
        precoFinal = precoFabri + lucroDistri + valorImp;
        System.out.printf("O lucro do distribuidor será: %.2f\n", lucroDistri);
        System.out.printf("O valor dos impostos é: %.2f\n", valorImp);
        System.out.printf("E o preço final para o consumidor é: %.2f\n", precoFinal);
    }
}
