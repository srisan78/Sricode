package Array;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray={22,55,88,1,5,0,11};
        int n= intArray.length;
        System.out.println("Original Array"+ Arrays.toString(intArray));
        for (int i = 0; i < n-1 ; i++) {
            for (int j = 0; j < n-1 ; j++) {
            if (intArray[j]>intArray[j+1]){
                int temp=intArray[j];
                intArray[j]=intArray[j+1];
                intArray[j+1]=temp;

            }
                System.out.println("sorted array is"+Arrays.toString(intArray));
            }

        }
    }
}
