import java.util.Scanner;

public class Solution {

    static Scanner in;

    public static void casoDePrueba() {
        long caso= in.nextInt();
        long copia= caso-2;
        caso*=caso*caso;
        copia*=copia*copia;
        System.out.println(caso-copia);

    }

    public static void main(String[] args) {

        in = new Scanner(System.in);

        int numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}