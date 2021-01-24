public class NotascomPesos {
    public static void main(String[] args) {
        double nota1, nota2, nota3, peso1, peso2, peso3, mediapond;
        System.out.println("A primeira nota é: ");
        nota1 = Double.parseDouble(System.console().readLine());
        System.out.println("A segunda nota é: ");
        nota2 = Double.parseDouble(System.console().readLine());
        System.out.println("A terceira nota é: ");
        nota3 = Double.parseDouble(System.console().readLine());
        System.out.println("O peso da nota 1 é: ");
        peso1 = Double.parseDouble(System.console().readLine());
        System.out.println("O peso da nota 2 é: ");
        peso2 = Double.parseDouble(System.console().readLine());
        System.out.println("O peso da nota 3 é: ");
        peso3 = Double.parseDouble(System.console().readLine());
        mediapond = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        System.out.printf("A média final será: %.2f", mediapond);
    }
}
