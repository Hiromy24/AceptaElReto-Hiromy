public class Solution {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int parcelaX = in.nextInt();
        int parcelaY = in.nextInt();
        int distanciaPosteMax = in.nextInt();

        if (parcelaX == 0 && parcelaY == 0 && distanciaPosteMax == 0)
            return false;
        else {
            int postes = 4;

            if (parcelaX > distanciaPosteMax) {
                postes = postes + (2 * (parcelaX / distanciaPosteMax));
                if (parcelaX % distanciaPosteMax == 0) {
                    postes = postes - 2;
                }
            }
            if (parcelaY > distanciaPosteMax) {
                postes = postes + (2 * (parcelaY / distanciaPosteMax));
                if (parcelaY % distanciaPosteMax == 0) {
                    postes = postes - 2;
                }
            }

            System.out.println(postes);
            return true;
        }

    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}