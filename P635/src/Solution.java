import java.util.Scanner;

public class Solution {

    static Scanner in;

    public static void casoDePrueba() {
        double caso= in.nextInt();
        int siglo;
        caso= caso/100;
        siglo=(int)caso;
        if (caso-Math.floor(caso)!=0){
        siglo++;
        }
        System.out.println(siglo);
    }

    public static void main(String[] args) {

        in = new Scanner(System.in);

        int numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}