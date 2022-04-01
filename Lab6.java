package exception;

public class Lab6 {
    public static void main(String[] args) {
        try{
            System.out.println(sum(new int[] {1,2,3,4,5}));
        }
        catch(Exception e){
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());
            //e.prinStackTrace();
            StackTraceElement[] traceElements = e.getStackTrace();
            for(int i=0; i<traceElements.length; i++){
                System.out.println(traceElements[i].getMethodName());
                System.out.println(traceElements[i].getClassName());
                System.out.println(traceElements[i].getLineNumber());
            }
        }
    }
    public static int sum(int[] list){
        int result = 0;
        for(int i=0; i<=list.length; i++)
            result += list[i];
        return result;
    }
}
