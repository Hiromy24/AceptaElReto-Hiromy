
public class Solution {
    // @Autor: Henry Raul Illescas Eras
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {
//            char palos[] = {'P', 'D', 'T', 'C'};
            String[] mazo = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
            String[] entradapalo = new String[4];
            String cartanum;
            String resultado= "";
            int contador = 0;
            for (int i = 0; i < 4; i++) {
                cartanum = in.next();
                //termina el programa si la entrada es 0
                if (cartanum.equals("0")) return false;
                // Cambia el valor de la posicion actual del array "mazo" a 0 si el numero de la carta
                // de la entrada es igual a la del mazo
                // "cambioZero se utiliza para terminar el bucle antes al momento de cambiar a 0
                boolean cambioZero = false;
                for (int j = 0; j < mazo.length && !cambioZero; j++) {
                    if (mazo[j].equals(cartanum)) {
                        mazo[j] = "0";
                        cambioZero = true;
                    }
                    //almacena los palos de la entrada para comprobar si son iguales mas adelante
                }
                String palo = in.next();
                entradapalo[contador] = palo;
                contador++;


            }
            //Comprueba que los palos de la entrada sean iguales de ser asi la respuesta del resultado
            // se cambia a "NADA" y la condicion del bucle se vuelve falsa
            for (int i = 0; i <entradapalo.length-1 && resultado.isEmpty() ; i++) {
                if (!entradapalo[i].equals(entradapalo[i+1]))
                    resultado= "NADA";
            }
            // el bucle busca los ceros, al encontrar el primero volvemos verdadera una condicion para
            // empezar a contar si existe mas de un espacio entre el primer y el segundo cero
            int hueco = 0;
            int noHueco = 0;
            int i;
            for (i = 0; i <mazo.length && !resultado.equals("NADA"); i++) {
                if (mazo[i].equals("0")){
                    hueco++;
                } else {
                    if (hueco >= 1 ) noHueco++;
                    if (hueco!=4 && noHueco==2) resultado="NADA";
                    if (hueco>=1 && noHueco==1) resultado= mazo[i];
                }
                if (hueco==4 && noHueco==0 && mazo[i].equals("A")) resultado= mazo[i+1];
            }
            if (noHueco==0 && !resultado.equals("NADA")) resultado= mazo[i-5];
            if (resultado.equals("NADA")){
                System.out.println(resultado);
            }else
                System.out.println(resultado+" "+entradapalo[0]);
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

} // class solution