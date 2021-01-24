public class QuinzeDuzentosQuadrado {
    public static void main(String[] args) {
        
        int num, quad = 0;

        for (num = 15; num <= 200 ; num++) {
            quad = num * num;
            System.out.printf("%d ao quadrado é = %d\n", num, quad);
        }
    }
}
