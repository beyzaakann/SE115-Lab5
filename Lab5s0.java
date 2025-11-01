import java.util.Scanner;

public class Lab5s0 {
    public static int factorial( int n){
        if(n < 0) return -9999;
        if(n == 0){
            return 1 ;
        } else {
            return n * factorial (n - 1);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Factorial(" + n + ") = " + factorial(n));
    }
}
