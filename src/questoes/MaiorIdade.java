public class MaiorIdade {
    public static void main (String[] args){

        int idade;

        do {
            System.out.print("Digite a sua idade: ");
            idade = Integer.parseInt(System.console().readLine());
        } while (idade < 18);
        System.out.print("Você tem mais de 18 anos!");
    }
}
