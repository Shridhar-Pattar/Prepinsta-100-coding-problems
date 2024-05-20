package PrimeNum;

public class Main {
    public static void main(String[] args) {
        int n=59;
        int count=0;
        for(int i=2;i<=n/2;i++){
         if (n%i==0) {
           count++;
         }
        
        }  
        if (count==0) {
            System.out.println("Num is prime");
        }else{
            System.out.println("Num is not Prime");
        }
    }
   
}
