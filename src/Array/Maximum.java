package Array;

public class Maximum {
    public static void main(String[] args) {
        int[] a=new int[] {20,30,40,50,-600,-500};
        int[] b=new int[]{1,-4,5,8-9};

findmax(a);
        findmax(b);
        findmin(a);
        findmin(b);
    }

    private static void findmax(int[]a) {
        int max;
        max=a[0];

        for (int i = 0; i < a.length; i++) {

            if(a[i] > max)
                max=a[i];


        }
        System.out.println("maximum value"+max);
    }


    private static void findmin(int[]a) {
        int min;
        min=a[0];

        for (int i = 0; i < a.length; i++) {
            if(a[i] < min)
                min=a[i];
        }
        System.out.println("minimum value"+min);
    }

}