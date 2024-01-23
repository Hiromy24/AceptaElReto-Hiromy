import java.util.ArrayList;

public class Solution {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int ninos = in.nextInt();
        int saltos = in.nextInt();
        if (ninos == 0 && saltos == 0) return false;
        else {

            ArrayList<Integer> Juego = new ArrayList<Integer>();
            //Añadimos el valor actual del contador para establecerlo como si fuera un identificador de un niño
            for (int i = 1; i <= ninos; i++)Juego.add(i);
            int index=0;
            //el juego removera de su array la posicion del salto mediante un contador para sumar saltos, de ser mayor
            //que el tamaño del juego se tomara su resto mediante el salto y el  tamaño del juego
            while(Juego.size()>1){
            index+=saltos;
            index%=Juego.size();
            Juego.remove(index);
            }
            //tras terminar el bucle, solo quedara una unica posicion que sera imprimida y que tendra el identificador del niño
            System.out.println(Juego.get(0));
            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}