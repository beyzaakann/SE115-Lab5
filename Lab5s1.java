import java.util.Scanner;

public class Lab5s1 {
    public static int sumDigits(int n){
        if(n < 0) return sumDigits(-n) ;
        if(n < 10){
            return n;
        }
        else{
            return ((n % 10) +sumDigits(n / 10));
        }
    }
    public static void main(String[] args){
        System.out.print("Enter your number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("The sum of the digits of " + n + " is: " + sumDigits(n));
    }
}
