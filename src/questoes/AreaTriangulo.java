public class AreaTriangulo {
    public static void main(String [] args){
        double b, h, a;
        System.out.println("Qual o valor da base? ");
        b = Double.parseDouble(System.console().readLine());
        System.out.println("Qual o valor da altura? ");
        h = Double.parseDouble(System.console().readLine());
        a = (b * h) / 2;
        System.out.printf("A área do triângulo é: %.1f", a);
    }
}
