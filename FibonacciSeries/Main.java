package FibonacciSeries;

public class Main {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        int nextTerm;
        int s=15;
        System.out.print(num1+","+num2+",");
        for(int i=2;i<s;i++){
            nextTerm=num1+num2;
            num1=num2;
            num2=nextTerm;
            System.out.print(nextTerm + ",");
        }

    }
}
