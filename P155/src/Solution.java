// Asume fichero llamado solution.java
public class Solution {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int X= in.nextInt();
        int Y=in.nextInt();
        if (X<0||Y<0)
        return false;
        else {
            X*=2;
            Y*=2;
            System.out.println(X+Y);
            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}