package Array;

public class ArrayEven {

    public static void main(String[] args) {
        int[] a= new int[50];
        for (int i=0,j=5;i<50;i++){
            a[i]=j;
            j=j+5;
            System.out.println(a[i]);
        }

    }
}
