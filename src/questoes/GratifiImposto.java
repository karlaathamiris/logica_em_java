public class GratifiImposto {
    public static void main(String [] args) {
        double salarioBase, gratific, imposto, salarioFinal;
        System.out.println("Digite abaixo o salário base do funcionario: ");
        salarioBase = Double.parseDouble(System.console().readLine());
        gratific = salarioBase * 5 / 100;
        imposto = salarioBase * 7 / 100;
        salarioFinal = salarioBase + gratific - imposto;
        System.out.printf("O salário com gratificações e descontos e: %.2f", salarioFinal);
    }
}
