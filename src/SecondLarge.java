public class SecondLarge {

        public static void main(String[] args) {
            int[] a = {2, 5, 7, 8, -12, 6};
            int[]b=new int[]{2,7,9,-300,50};
        findmax(a);
findmax(b);

    }

    private static void findmax(int[] a) {
        int max1;
        int max2;
        max1 = a[0];
        max2 = a[0];


        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];


            } else if (a[i] > max2) {
                max2 = a[i];


                    }

                }
                System.out.println("First max value:" + max1);
                System.out.println("second max value:" + max2);

            }

        }