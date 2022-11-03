package Array;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class ArrayExample {
    public static void main(String[] args) {
        int[] a=new int[10];
        int[] x ={1,2,3,4,5,6,7};
        for (int i = 0; i <a.length ; i++) {
         //   System.out.println(a[i]);
        }
        printEvenNumbers(x);

        }
        private static void printArray(int[]a){
        for (int arr: a){
            System.out.println(arr);
        }
        }
    private static int[] printEvenNumbers(int [] input) {
        int[] output = new int[input.length];
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                output[counter] = input[i];
                counter++;

            }

        }
        printArray(output);
        return output;
    }
}
