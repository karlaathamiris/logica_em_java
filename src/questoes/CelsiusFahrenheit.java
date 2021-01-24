public class CelsiusFahrenheit {
    public static void main(String [] args) {
        double celsius, farh;
        System.out.println("Digite a temperatura em Celsius: ");
        celsius = Double.parseDouble(System.console().readLine());
        farh = (9 * celsius / 5) + 32;
        System.out.printf("A mesma temperatura em Fahrenheit é: %.1f", farh);
    }
}
