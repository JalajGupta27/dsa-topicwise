package Recursion;

public class PowerOfNumber {
    public static void main(String[] args) {
        int base = 3, pow = 3;
        System.out.println(power(base, pow));
    }

    private static int power(int base, int pow) {
        if (pow == 0)
            return 1;
        return base * power(base, pow - 1);
    }

}
