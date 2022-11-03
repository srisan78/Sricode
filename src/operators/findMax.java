package operators;

public class findMax {
    public static void main(String[] args) {
        int a=10;
        int b=500;
        int c=500;
        if(a>b && a>c) {
            System.out.println("a is greater");
        }else
            if (b==c){
                System.out.println("b and c greater then a");
        }else if(b>c) {
            System.out.println("b is greater");
        }else{
            System.out.println("c is greater");

        }
    }
}
