package ExceptionHandling;

public class finallyBlockException {
    public static void main(String[] args) {
        int [] arr=new int[5];
        try{
            arr[6]=10;

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException"+e.getMessage());
        }finally {
            System.out.println("finally block executed");
        }
    }
}
