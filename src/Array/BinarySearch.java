package Array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr=new int[]{10,22,44,66,77,55,3,6,88};
        int binarySearch=6;
        for (int i = 0; i <arr.length ; i++) {
            int val=arr[i];
            if (val==binarySearch){
                System.out.println("we found the position:"+i);
            }


        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int position=Arrays.binarySearch(arr,binarySearch);
        System.out.println(position);


    }
}
