package Array;

import java.util.Arrays;

public class RemoveIndex {
    public static void main(String[] args) {
        int[] arr={10,23,55,7,88,99,70,};
        int removeIndex=4;
        for (int i = removeIndex; i < arr.length-1 ; i++) {
            arr[i]=arr[i+1];
            System.out.println(Arrays.toString(arr));

        }
    }
}
