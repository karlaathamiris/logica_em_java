public class TresNotasMedia {
    public static void main(String [] args) {
        float nota1, nota2, nota3;
        System.out.println("Digite a sua primeira nota: ");
        nota1 = Float.parseFloat(System.console().readLine());
        System.out.println("Digite a sua segunda nota: ");
        nota2 = Float.parseFloat(System.console().readLine());
        System.out.println("Digite a sua terceira nota: ");
        nota3 = Float.parseFloat(System.console().readLine());
        System.out.printf("A sua média e: %.2f", (nota1 + nota2 + nota3) / 3);
    }
}
