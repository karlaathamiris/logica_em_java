public class AnoNascimento {
    public static void main(String [] args){
        int anoNasc, anoAtual, idadeAnos, idadeMeses, idadeSemanas, idadeDias;
        System.out.println("Qual seu ano de nascimento? ");
        anoNasc = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o ano em que estamos: ");
        anoAtual = Integer.parseInt(System.console().readLine());
        idadeAnos = anoAtual - anoNasc;
        idadeMeses = idadeAnos * 12;
        idadeSemanas = idadeAnos * 52;
        idadeDias = idadeAnos * 365;
        System.out.printf("A idade da pessoa em anos é: %d\n", idadeAnos);
        System.out.printf("A idade da pessoa em meses é: %d\n", idadeMeses);
        System.out.printf("A idade da pessoa em dias é: %d\n", idadeDias);
        System.out.printf("A idade da pessoa em semanas é: %d\n", idadeSemanas);
    }
}
