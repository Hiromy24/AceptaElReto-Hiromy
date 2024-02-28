public class Solution {
    static java.util.Scanner in;

    public static void casoDePrueba() {

        int caso = in.nextInt();
        String restos="";
        do{
            restos=caso%6+restos;
            caso=caso/6;
        }while (caso>=6);

        if (caso!=0){
            restos=caso+restos;
        }
        System.out.println(restos);
    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}