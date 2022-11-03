package Array;

public class SecMin {
    public static void main(String[] args) {
        int[] a = {2, 5, 7, 8, -12, 6};
        int[] b = new int[]{2, 7, 9, -300, 50};
        findmin(a);
        findmin(b);
    }

    private static void findmin(int[] a) {
        int min1;
        int min2;
        min1 = a[0];
        min2= a[0];


        for (int i = 0; i < a.length; i++) {
            if (a[i] < min1) {
                min2 = min1;
                min1 = a[i];


            } else if (a[i] < min2) {
                min2 = a[i];

            }
        }
        System.out.println(min1);
    }
}
