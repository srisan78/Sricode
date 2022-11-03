package Array;

public class MinMax {
    public static void main(String[] args) {
        int []  number=new int[] {10, 40, 500, 344, -344, 50, -500};
        int min, max;
        min = max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] < min)
                min = number[i];
                if (number[i] > max)
                    max = number[i];
                }
                System.out.println("min=" + min + "Max=" + max);
            }
        }
