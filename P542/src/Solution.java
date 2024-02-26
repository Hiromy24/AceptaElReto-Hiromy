import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    static java.util.Scanner in;

    public static void casoDePrueba() {
        boolean compatibilidad = false;

        ArrayList<Integer> juguete = new ArrayList<>();
        ArrayList<Integer> caja = new ArrayList<>();

        for (int i = 0; i < 3; i++) {juguete.add(in.nextInt());}
        for (int i = 0; i < 3; i++) {caja.add(in.nextInt());}
        Collections.sort(juguete);
        Collections.sort(caja);
        if (juguete.get(2) < caja.get(2) && juguete.get(1) < caja.get(1) && juguete.get(0) < caja.get(0)) {compatibilidad = true;}

        if (compatibilidad) {
            System.out.println("SIRVE");
        } else {
            System.out.println("NO SIRVE");
        }
    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}