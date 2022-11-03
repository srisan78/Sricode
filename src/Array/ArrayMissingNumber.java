package Array;

public class ArrayMissingNumber {
    public static void main(String[] args) {
        int totalNum;
        int [] numbers=new int[]{1,2,3,4,5,6,7,8,10};
        totalNum=10;
        int Expected_num_sum=totalNum * ((totalNum+1)/2);
        int num_sum=0;
        for (int i: numbers) {

            num_sum +=i;

        }
        System.out.println("Missing number is");
        System.out.println(Expected_num_sum - num_sum);


    }
}
