package Array;

public class CommonElement {
    public static void main(String[] args) {
        int[] array1={1,10,30,4,7,9,2};
        int[] array2={13,18,30,4,77,19,22};
        for (int i = 0; i <array1.length ; i++) {
            for (int j = 0; j <array1.length ; j++) {
if (array1[i]==array2[j]) {
    System.out.println("common Element is :"+array1[i]);
}
}
            }
        }

    }

