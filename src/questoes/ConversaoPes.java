public class ConversaoPes {
    public static void main(String [] args){
        double pes, pol, jardas, milhas;
        System.out.println("Dê o valor em pés para a conversão: ");
        pes = Double.parseDouble(System.console().readLine());
        pol = pes * 12;
        jardas = pes / 3;
        milhas = jardas / 1760;
        System.out.printf("Em polegadas é: %.1f\n", pol);
        System.out.printf("Em jardas é: %.1f\n", jardas);
        System.out.printf("Em milhas é: %.1f\n", milhas);
    }
}
