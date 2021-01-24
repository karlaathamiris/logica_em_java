public class AreaQuadrado {
    public static void main(String [] args){
        double l, a;
        System.out.println("Qual o valor do lado? ");
        l = Double.parseDouble(System.console().readLine());
        a = l * l;
        System.out.printf("O valor da área do quadrado é: %.1f", a);
    }
}
