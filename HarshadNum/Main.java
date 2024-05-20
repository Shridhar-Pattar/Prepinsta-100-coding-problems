package HarshadNum;

public class Main {
    public static void main(String[] args) {
        int n = 47;
        int originalNumber = n;
        int result = 0;

        while (n != 0) {
            int pick_last = n % 10;
            result = result + pick_last;
            n = n / 10;
        }

        if (originalNumber % result == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");
    }
}
