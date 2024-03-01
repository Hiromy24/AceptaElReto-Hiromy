public class Solution {

    static java.util.Scanner in;

    public static void casoDePrueba() {

        int caso= in.nextInt();
            if (caso%2==0){
                System.out.println(caso+1);
            }else{
                System.out.println(caso-1);
            }


    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}