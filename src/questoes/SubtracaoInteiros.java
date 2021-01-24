public class SubtracaoInteiros { 

    public static void main(String[] args) {

        int num1, num2;
        System.out.println("Digite o primeiro numero: ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o segundo numero: ");
        num2 = Integer.parseInt(System.console().readLine());
        System.out.printf("O resultado e: %d", num1 - num2);

    }

}