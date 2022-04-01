package exception;

public class Lab3 {
    public static void main(String[] args) {
        try {
            System.out.println("Statement1");
            System.out.println("Statement2");
            System.out.println("Statement3");
        }
//        catch (Exception e){
//        }
        finally {
            System.out.println("Statement4");
        }
        System.out.println("Statement5");
    }
}
