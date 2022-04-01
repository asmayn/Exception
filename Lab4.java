package exception;

public class Lab4 {
    public static void main(String[] args) {
        try {
            System.out.println("Statement1");
            //System.out.println(1/0);
            String s = "abc";
            System.out.println(s.charAt(3));
            System.out.println("Statement3");
        }
        catch(ArrayIndexOutOfBoundsException e){
        }
        catch(ArithmeticException e){
            throw e;
        }
        finally {
            System.out.println("Statement4");
        }
        System.out.println("Statement5");
    }
}
