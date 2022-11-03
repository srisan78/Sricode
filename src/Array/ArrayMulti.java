package Array;

public class ArrayMulti {
    public static void main(String[] args) {
        int [][] arr=new int [3][4];

        arr[0][0]=300;
         arr[0][1]=400;
         arr[0][2]=500;
          arr[0][3]=600;
          arr[1][0]=3000;
          arr[1][1]=5000;
         arr[1][2]=6000;
         arr[1][3]=7000;
         arr[2][0]=60;
          arr[2][1]=70;
         arr[2][2]=80;
         arr[2][3]=90;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }


    }
}
