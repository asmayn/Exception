package exception;
import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println(number1 + "/" + number2 + " = " + (number1/number2));
    }
}
