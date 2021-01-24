public class PrecoComDesc {
    public static void main(String [] args) {
        double precoinic, precofinal, descon;
        System.out.println("Digite o preco inicial do produto:");
        precoinic = Double.parseDouble(System.console().readLine());
        descon = precoinic * 0.1;
        precofinal = precoinic - descon;
        System.out.printf("O preco do produto com desconto e: %.2f", precofinal);
    }
}
