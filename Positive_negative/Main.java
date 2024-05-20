package Positive_negative;
//Check the Number is Positive or Negative

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n =sc.nextInt();

        if (n>0) {
            System.out.println("the number is positive");
        }else{
            System.out.println("the number is Negative");
        }
        sc.close();
    }
}