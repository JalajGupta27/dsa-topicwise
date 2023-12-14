package Recursion;

public class GCDof2Number {
    public static void main(String[] args) {
        System.out.println(gcd(125,100));
    }

    private static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

}
