public class Solution {

    static java.util.Scanner in;

    public static void casoDePrueba() {
        int dia= in.nextInt();
        int mes= in.nextInt();

        if (dia == 25 && mes == 12) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

    }
    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}