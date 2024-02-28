public class Solution {

    static java.util.Scanner in;


    public boolean RepeDife(String cadena) {
        boolean repe = false;
        for (int i = 0; i < cadena.length() - 1 && !repe; i++) {
            for (int j = i + 1; j < cadena.length() && !repe; j++) {
                if (cadena.charAt(i) == cadena.charAt(j)) {
                    repe = true;
                }
            }
        }
        return repe;
    }

    public static void casoDePrueba() {
        boolean repetido = false;
        int year = in.nextInt();
        String yearString = String.valueOf(year);
        Solution respuesta = new Solution();
        repetido = respuesta.RepeDife(yearString);

        boolean copiaRepetido = repetido;
        while (copiaRepetido == repetido) {
            year--;
            yearString = String.valueOf(year);
            copiaRepetido = respuesta.RepeDife(yearString);
        }
        copiaRepetido = !copiaRepetido;
        repetido = copiaRepetido;
        int copiaYear = year;
        int i = 0;
        while (copiaRepetido == repetido) {
            year++;
            i++;
            yearString = String.valueOf(year);
            copiaRepetido = respuesta.RepeDife(yearString);
        }
        i--;
        System.out.println(copiaYear + 1 + " " + i);
    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}