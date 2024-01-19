public class Solution {

    static java.util.Scanner in;

    public static void casoDePrueba() {
        String Soy = in.next();
        String entrada = in.next();
        System.out.println("Hola, " + entrada + ".");
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}