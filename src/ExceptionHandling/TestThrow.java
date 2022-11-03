package ExceptionHandling;

public class TestThrow {
    public static void validation(int age){

        if (age <18){
            throw new NullPointerException("Not eligible to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        validation(12);
    }
}
