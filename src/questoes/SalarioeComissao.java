public class SalarioeComissao {
    public static void main(String[] args) {
        double salFixo, valorVendas, comissao, salFinal;
        System.out.println("O salário fixo do funcionário é: ");
        salFixo = Double.parseDouble(System.console().readLine());
        System.out.println("O valor das vendas do funcionário foi: ");
        valorVendas = Double.parseDouble(System.console().readLine());
        comissao = valorVendas * 0.04;
        salFinal = salFixo + comissao;
        System.out.printf("O valor da comissão será: %.2f\n", comissao);
        System.out.printf("E o valor do salário final será: %.2f", salFinal);
    }
}
