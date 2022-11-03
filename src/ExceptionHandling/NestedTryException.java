package ExceptionHandling;

public class NestedTryException {
    public static void main(String[] args) {
       try {


           String nullValue = "don";
           System.out.println(nullValue.length());
           try {
               System.out.println("devided by ");
               int a = 10 / 0;
           }catch(ArithmeticException e) {
               System.out.println(e);
           }
           try{
               System.out.println("assigning to greter then array value");
               int []arr=new int[5];
               arr[7]=16;
           }catch (ArrayIndexOutOfBoundsException e){
               System.out.println(e);
           }
       } catch (StringIndexOutOfBoundsException e){
           System.out.println(e);
       }catch (RuntimeException e){
           System.out.println(e);
       }catch (Exception e){
           System.out.println(e);
       }
    }
}
