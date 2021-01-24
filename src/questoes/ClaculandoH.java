public class ClaculandoH {
    public static void main(String[] args) {
        int N, cont;
        double H;
            
        System.out.print("Informe o valor N: ");
        N = Integer.parseInt(System.console().readLine());
        H = 0;
        cont = 1;
        while (cont < N){
             H = H + 1.0 / cont;
            cont = cont + 1;
        }
        System.out.printf("\nH = %f\n", H);
    }
}