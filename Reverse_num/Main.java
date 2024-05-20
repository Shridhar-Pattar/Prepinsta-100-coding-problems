package Reverse_num;

public class Main {
    public static void main(String[] args) {
        int n=346;
        int rev=0;
        int rem;
       while (n!=0) {
            rem = n%10;
            rev = rem+rev*10;
            n=n/10;

       }
       System.err.println(rev);

    }
}
