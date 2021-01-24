public class DivisaoDoisNumeros {
    public static void main(String [] args){

        double num1, num2;
        System.out.println("Digite o primeiro número, deve ter o maior valor: ");
        num1 = Double.parseDouble(System.console().readLine());
        System.out.println("Digita o segundo número, deve ter o menor valor:");
        num2 = Double.parseDouble(System.console().readLine());
        System.out.printf("O resultado da divisão do primeiro pelo segundo e: %.2f", num1 / num2);
    }
}