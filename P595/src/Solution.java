public class Solution {

    static java.util.Scanner in;

    public static void casoDePrueba() {

        System.out.println(in.nextInt()/100);

    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}