import java.util.Scanner;

public class Lab5s2 {
    public static long power(long base, int exp){
        if(exp == 0) return 1;
        return base * power(base, exp-1);
    }
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your base: ");
        long base = input.nextLong();
        System.out.print("Enter your exponent: ");
        int exp = input.nextInt();
        System.out.println(power(base, exp));
    }
}
