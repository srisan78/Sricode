package Array;

public class ArrayStringDemo {
    public static void main(String[] args) {
        String str="my name is sridhar";
        String[] strings=str.split( " ");
        for (int i = strings.length-1; i>=0 ; i--) {
            System.out.print(strings[i]+" ");
        }

    }
}
