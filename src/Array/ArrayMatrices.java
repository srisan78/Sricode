package Array;

public class ArrayMatrices {
    public static void main(String[] args) {
        int[][] m1 = {{1, -2, 3}, {2, 2, 2}, {3, 3,- 3}};
        int[][] m2 = {{1, 2, 3}, {2, -2, 2}, {3, 3, 3}};
        //int[][] sum = new int[3][3];

        System.out.println("Element of first matrices");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(m1[i][j] +"  ");
            }
            System.out.println();
        }
        System.out.println("elements second matrices");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(m2[i][j] + "  ");
            }
            System.out.println();

        }
        System.out.println("Add matrices");
        for (int i = 0; i < 3; i++) {
           for (int j = 0; j <3 ; j++) {

                System.out.print(m1[i][j]*m2[i][j]+"  ");
            }
            System.out.println();
    }
}
}