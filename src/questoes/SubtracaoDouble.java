public class SubtracaoDouble { 

    public static void main(String[] args) {

        double num1, num2;
        System.out.println("Digite o primeiro numero: ");
        num1 = Double.parseDouble(System.console().readLine());
        System.out.println("Digite o segundo numero: ");
        num2 = Double.parseDouble(System.console().readLine());
        System.out.printf("O resultado e: %.2f", num1 - num2);

    }

}