public class SomaDezValores {
    
    public static void main(String[] args) {
        
        double num, soma = 0;
        //int cont = 0;

        //do {
        for (int i = 0; i < 10; i++){
            System.out.println("Escreva o numeral inteiro desejado: ");
            num = Double.parseDouble(System.console().readLine());
            
            soma += num; 
        } 

        System.out.println("A soma dos 10 números é: " + soma); 

    }
}
