package ArmstrongNum;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int m=n;
        int length = String.valueOf(n).length();
       

        int a;
        int arm=0;
        while (n!=0) {
            a = n%10;
            
            arm = arm + (int) Math.pow(a,length);
            n = n/10;
        }
        System.out.println(arm);
        if(m==arm){
            System.out.println("its a armstrong number");
        }else{
            System.out.println("its not a armstrong number");
        }

    }
}