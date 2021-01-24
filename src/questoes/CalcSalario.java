public class CalcSalario {
    public static void main(String[] args) {
        double horaTrab, salMinimo, valorHTrab, salBruto, imposto, salFinal;
        System.out.println("Digite o número de horas trabalhadas: ");
        horaTrab = Double.parseDouble(System.console().readLine());
        System.out.println("Digite o valor do salário mínimo: ");
        salMinimo = Double.parseDouble(System.console().readLine());
        valorHTrab = 0.1 * salMinimo;
        salBruto = horaTrab * valorHTrab;
        imposto = 0.03 * salBruto;
        salFinal = salBruto - imposto;
        System.out.printf("O salário final do trabalhor é: %.2f", salFinal);
    }
}
