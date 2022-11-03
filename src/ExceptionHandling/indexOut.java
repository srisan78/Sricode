package ExceptionHandling;

public class indexOut {
    public static void main(String[] args) {
        String [] arr=new String[10];
        for (int i = 0; i < arr.length ; i++) {
            try{
                System.out.println(arr[15]);
            }
            catch (ArrayIndexOutOfBoundsException s){
s.printStackTrace();
            }
        }
        System.out.println("hello");
        System.out.println("hi");

        }
    }

