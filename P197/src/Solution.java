import java.util.Scanner;

// Asume fichero llamado solution.java
public class Solution {

    static java.util.Scanner in;
    public String xee(String x){
        String primerCambio="";
        String segundoCambio="";
        for (int i = 0; i <x.length() ; i+=2) {
           primerCambio=primerCambio+x.charAt(i);
        }
        for (int i = 1; i <x.length(); i+=2) {
            segundoCambio=x.charAt(i)+segundoCambio;
        }

        return xe(primerCambio+segundoCambio);

    }
    public String xe(String xee){
        String agarrado="";
        String correcto="";
        for (int i = 0; i <xee.length() ; i++) {
            boolean palanca=false;
            char r=xee.charAt(i);
            if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u'||r=='A'||r=='E'||r=='I'||r=='O'||r=='U'){
                palanca=true;
            }
            if (palanca){
                for (int j = agarrado.length()-1; j >=0 ; j--) {
                    char temp;
                    temp=agarrado.charAt(j);
                    correcto=correcto+temp;
                }
                correcto=correcto+r;
                agarrado="";
                continue;
            }
            agarrado=agarrado+r;
            if (i==xee.length()-1){
                for (int j = agarrado.length()-1; j >=0 ; j--) {
                    char temp;
                    temp=agarrado.charAt(j);
                    correcto=correcto+temp;
                }
            }
        }
        return correcto;
    }
    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {
            Scanner sc = new Scanner(System.in);
            String entrada = in.nextLine();
            Solution prueba = new Solution();

            System.out.println(entrada+ " => "+prueba.xee(entrada));
            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

} // class solution