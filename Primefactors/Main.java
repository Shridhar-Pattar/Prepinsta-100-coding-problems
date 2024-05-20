package Primefactors;

public class Main {
    public static void main(String[] args) {
        int n = 12;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i);
                n /= i;
                if (n != 1) {
                    System.out.print(",");
                }
            }
        }
    }
}