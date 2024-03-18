import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static Scanner in;

    public static void casoDePrueba() {
        int caso = in.nextInt();
        int kaprekar = 6174;
        int vueltas = 0;

        if (!repetido(caso)) {
            while (caso != kaprekar) {
                StringBuilder valorMenor = new StringBuilder();
                StringBuilder valorMayor = new StringBuilder();
                int[] copiaCa = new int[4];
                int[] ca = {0, 0, 0, 0};
                for (int i = 0; i < String.valueOf(caso).length(); i++) {
                    copiaCa[i] = Integer.parseInt(String.valueOf(caso).substring(i, i + 1));
                }
                Arrays.sort(copiaCa);
                for (int i = 3; i >= 0; i--) {
                    ca[i] = copiaCa[3 - i];
                }
                for (int i = 0; i < ca.length; i++) {
                    valorMayor.append((ca[i]));

                    valorMenor.append((copiaCa[i]));
                }
                caso = Integer.parseInt(valorMayor.toString()) - Integer.parseInt(valorMenor.toString());
                vueltas += 1;
            }
        } else {
            vueltas = 8;
        }
        System.out.println(vueltas);
    }

    public static boolean repetido(int caso) {
        StringBuilder cs = new StringBuilder(String.valueOf(caso));
        if (cs.toString().equals("0")){
            return true;
        }
        if(cs.length()<4){
            for (int i = 4; i >cs.length() ; i--) {
                cs.insert(0, "0");
            }
        }
        return cs.charAt(0) == cs.charAt(1) && cs.charAt(0) == cs.charAt(2) && cs.charAt(0) == cs.charAt(3);
    }

    public static void main(String[] args) {

        in = new Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}
