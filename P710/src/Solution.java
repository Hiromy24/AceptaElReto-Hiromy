public class Solution {

    static java.util.Scanner in;

    public static void casoDePrueba() {

        int limite=in.nextInt();
        int ocu=0;
        for (int i = 0; i <6 ; i++) {
            ocu=ocu+in.nextInt();
        }
        System.out.println(limite-ocu);
    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}