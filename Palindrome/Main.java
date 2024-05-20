package Palindrome;

public class Main {
    public static void main(String[] args) {
        int n=343;
        int m=n;
        int rev=0;
        int rem;
        while (n!=0) {
          rem =n%10;
          rev = rev*10+rem;
          n=n/10;  
        }
        System.out.println(rev);
        if (m==rev) {
            System.out.println("the num is Palindrome");
        }else{
            System.out.println("the num is not a Palindrome");
        }
    }
}
