package exception;
import java.util.Scanner;

public class friException {

    public static void main(String[] args) {
        System.out.println(quotient(6,0));
    }
        public static  int quotient(int number1, int number2) {
            if(number2 == 0)
                throw new ArithmeticException("Divisor cannot be zero");
            return number1 / number2;
        }

    String getMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
